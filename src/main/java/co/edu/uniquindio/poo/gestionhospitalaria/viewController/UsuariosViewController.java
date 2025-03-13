package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import co.edu.uniquindio.poo.gestionhospitalaria.App;
import javafx.event.ActionEvent;

public class UsuariosViewController {
    @FXML
    private Text lbl_bienvenido;

    @FXML
    private AnchorPane ap_usuario;

    @FXML
    private Text lbl_iniciarComo;

    @FXML
    private Button btn_paciente;

    @FXML
    private Button btn_administrador;


    @FXML
    void onPaciente(ActionEvent event) {
        app.openInicioPaciente();
    }

    @FXML
    void onAdministrador(ActionEvent event){
        app.openInicioAdministrador();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
    }
}