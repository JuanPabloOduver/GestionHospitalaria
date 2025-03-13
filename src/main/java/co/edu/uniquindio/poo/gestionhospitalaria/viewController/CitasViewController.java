package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import co.edu.uniquindio.poo.gestionhospitalaria.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class CitasViewController {
    @FXML
    private TableColumn<?, ?> tb_nombreDoctor;

    @FXML
    private ImageView img_carro;

    @FXML
    private AnchorPane ap_gestionCliente;

    @FXML
    private TableColumn<?, ?> tb_idDoctor;

    @FXML
    private Button btn_listar;

    @FXML
    private TextField txf_doctor;

    @FXML
    private Button btn_reservar;

    @FXML
    private Button btn_cancelar;

    @FXML
    private TextField txf_fecha;

    @FXML
    private Text txt_reservas;

    @FXML
    private TableView<?> tb_listCitas;

    @FXML
    private TableColumn<?, ?> tb_fecha;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private ImageView img_carro1;

    @FXML
    private TextField txf_hora;

    @FXML
    private TableColumn<?, ?> tb_hora;

    @FXML
    void onVolver(ActionEvent event) {

    }

    @FXML
    void onListar(ActionEvent event) {

    }

    @FXML
    void onCancelar(ActionEvent event) {

    }

    @FXML
    void onReservar(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }
}