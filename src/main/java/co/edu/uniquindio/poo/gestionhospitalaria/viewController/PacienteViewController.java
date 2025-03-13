package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import co.edu.uniquindio.poo.gestionhospitalaria.App;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class PacienteViewController {
    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private TableColumn<?, ?> tb_nombreDoctor;

    @FXML
    private Button btn_registrarPc;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private ImageView img_carro;

    @FXML
    private TableColumn<?, ?> tb_idDoctor;

    @FXML
    private Text txt_quedeseahacer1;

    @FXML
    private Text txt_nombreCliente1;

    @FXML
    private Text txt_nombreCliente;

    @FXML
    private Text txt_quedeseahacer;

    @FXML
    private Text txt_reservas;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private TableView<?> tb_listCitas;

    @FXML
    private TableColumn<?, ?> tb_fecha;

    @FXML
    private Button btn_otros;

    @FXML
    private Text txt_tucarro;

    @FXML
    private AnchorPane ap_administrador;

    @FXML
    private TableColumn<?, ?> tb_hora;

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuarios();
    }

    @FXML
    void onRegistrarPc(ActionEvent event) {

    }

    @FXML
    void onOtros(ActionEvent event) {

    }
    @FXML
    void initialize() {
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }
}
