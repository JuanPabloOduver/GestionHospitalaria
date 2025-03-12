package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class CrudPacienteViewController {
    @FXML
    private TextField txf_nombre;

    @FXML
    private Button btn_agregarDoctor;

    @FXML
    private ImageView img_carro;

    @FXML
    private AnchorPane ap_gestionCliente;

    @FXML
    private Button btn_actualizarDoctor;

    @FXML
    private TableColumn<?, ?> tbc_edad;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<?, ?> tbc_apellido;

    @FXML
    private TableColumn<?, ?> tbc_nombre;

    @FXML
    private TextField txf_edad;

    @FXML
    private TextField txf_cedula;

    @FXML
    private TableView<?> tb_listClientes;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<?, ?> tbc_cedula;

    @FXML
    private TextField txf_apellido;


    @FXML
    void onVolver(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onAgregar(ActionEvent event) {

    }
}




