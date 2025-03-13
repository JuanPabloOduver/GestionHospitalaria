package co.edu.uniquindio.poo.gestionhospitalaria.viewController;
import co.edu.uniquindio.poo.gestionhospitalaria.App;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Hospital;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.beans.property.SimpleStringProperty;
import co.edu.uniquindio.poo.gestionhospitalaria.model.Doctor;


public class CrudDoctorViewController {
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
    private TableColumn<Doctor, String> tbc_edad;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<Doctor, String> tbc_apellido;

    @FXML
    private TableColumn<Doctor, String> tbc_nombre;

    @FXML
    private TextField txf_edad;

    @FXML
    private TextField txf_cedula;

    @FXML
    private TableView<Doctor> tb_listDoctores;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Doctor, String> tbc_cedula;

    @FXML
    private TextField txf_apellido;

    @FXML
    void onVolver(ActionEvent event) {
        app.openAdministrador();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        //eliminarDoctor();
    }

    @FXML
    void onActualizar(ActionEvent event) {
        //actualizarDoctor();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        //agregarDoctor();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }


    /**
    CrudDoctorController crudDoctorController;
    ObservableList<Doctor> listDoctores = FXCollections.observableArrayList();
    Doctor selectedDoctor;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        crudDoctorController = new CrudDoctorController(app.hospital);
        initView();
    }

    private void initView() {
        // Traer los datos del doctor a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerDoctores();

        // Agregar los elementos a la tabla
        tb_listDoctores.setItems(listDoctores);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbc_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        tbc_edad.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getEdad())));
        tbc_apellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerDoctores() {
        listDoctores.addAll(crudDoctorController.obtenerListaDoctores());
    }

    private void listenerSelection() {
        tb_listDoctores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedDoctor = newSelection;
            mostrarInformacionDoctor(selectedDoctor);
        });
    }

    private void mostrarInformacionDoctor(Doctor doctor) {
        if (doctor != null) {
            txf_cedula.setText(doctor.getId());
            txf_nombre.setText(doctor.getNombre());
            txf_apellido.setText(doctor.getApellido());
            txf_edad.setText(Integer.toString(doctor.getEdad()));
        }
    }

    private void agregarDoctor() {
        Doctor doctor = buildDoctor();
        if (crudDoctorController.crearDoctor(doctor)) {
            listDoctores.add(doctor);
            limpiarCamposDoctor();
        }
    }

    private Doctor buildDoctor() {
        int edad = Integer.parseInt(txf_edad.getText());

        Doctor doctor = new Doctor(txf_nombre.getText(), txf_cedula.getText(), txf_apellido.getText(), edad);
        return doctor;
    }

    private void eliminarDoctor() {
        int id = Integer.parseInt(txf_cedula.getText()); // Convierte el texto a entero
        if (crudDoctorController.eliminarDoctor(id)) { // Pasa el entero como argumento
            listDoctores.remove(selectedDoctor);
            limpiarCamposDoctor();
            limpiarSeleccion();
        }
    }

    private void actualizarDoctor() {

        if (selectedDoctor != null && crudDoctorController.actualizarDoctor(selectedDoctor.getId(), buildDoctor())) {
            int index = listDoctores.indexOf(selectedDoctor);
            if (index >= 0) {
                listDoctores.set(index, buildDoctor());
            }
            tb_listDoctores.refresh();
            limpiarSeleccion();
            limpiarCamposDoctor();
        }
    }

    private void limpiarSeleccion() {
        tb_listDoctores.getSelectionModel().clearSelection();
        limpiarCamposDoctor();
    }

    private void limpiarCamposDoctor() {
        txf_cedula.clear();
        txf_nombre.clear();
        txf_apellido.clear();
        txf_edad.clear();
    }
    */
}
