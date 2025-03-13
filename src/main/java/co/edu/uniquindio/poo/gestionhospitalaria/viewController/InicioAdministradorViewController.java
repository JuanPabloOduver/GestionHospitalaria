package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import co.edu.uniquindio.poo.gestionhospitalaria.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Administrador;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Hospital;

public class InicioAdministradorViewController {
    @FXML
    private TextField txf_nombreAd;

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
        app.openAdministrador();
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    private Administrador administradorIniciado;

    public void verificarAdministrador() {
        String nombreIngresado = txf_nombreAd.getText().trim();
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
        boolean administradorEncontrado = false;
        Hospital hospital = Hospital.getInstancia();
        for (Administrador administrador : hospital.getListaAdministradores()) {
            if (cedulaIngresada.equals(administrador.getId()) && nombreIngresado.equals(administrador.getNombre())) {
                administradorIniciado = administrador;
                app.openAdministrador();
                administradorEncontrado = true;
                break;
            }
        }
        if (!administradorEncontrado) {
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
        txf_nombreAd.clear();
    }
}
