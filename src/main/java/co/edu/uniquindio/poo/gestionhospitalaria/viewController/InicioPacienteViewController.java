package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import co.edu.uniquindio.poo.gestionhospitalaria.App;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Administrador;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Hospital;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Paciente;
import javafx.scene.control.Alert;

import javafx.event.ActionEvent;

public class InicioPacienteViewController {
    @FXML
    private TextField txf_nombrePc;

    @FXML
    private Button btn_volver;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_ingresar;

    @FXML
    private TextField txf_contraseña;

    @FXML
    private Text txt_administrador;

    @FXML
    private AnchorPane ap_administrador;

    @FXML
    void onIngresar(ActionEvent event) {
        app.openPaciente();
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    private Paciente pacienteIniciado;

    public void verificarPaciente() {
        String nombreIngresado = txf_nombrePc.getText().trim();
        String cedulaIngresada = txf_contraseña.getText().trim();
        if (cedulaIngresada.isEmpty() || nombreIngresado.isEmpty()) {
            mostrarAlerta("Los datos no pueden estar vacíos.");
            return;
        }
        int cedulaIngresadaInt;
        try {
            cedulaIngresadaInt = Integer.parseInt(cedulaIngresada);
        } catch (NumberFormatException e) {
            mostrarAlerta("La cédula debe ser un número válido.");
            limpiarCampos();
            return;
        }
        boolean clienteEncontrado = false;
        Hospital hospital = Hospital.getInstancia();
        for (Paciente paciente : hospital.getListaPacientes()) {
            if (cedulaIngresada.equals(paciente.getId()) && nombreIngresado.equals(paciente.getNombre())) {
                pacienteIniciado = paciente;
                app.openPaciente();
                clienteEncontrado = true;
                break;
            }
        }
        if (!clienteEncontrado) {
            mostrarAlerta("Cédula o nombre incorrectos.");
            limpiarCampos();
        }
    }

    private void mostrarAlerta(String mensaje) {
        // Crear y mostrar una alerta de error o advertencia
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Advertencia");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    private void limpiarCampos() {
        txf_contraseña.clear();
        txf_nombrePc.clear();
    }

    @FXML
    void initialize() {
    }
}