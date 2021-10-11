package UA1.Chat;

import java.io.IOException;

import UA1.Chat.modelo.Mensaje.Mensaje;
import UA1.Chat.modelo.Usuario.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class SecondaryController {
    @FXML
    private TableView<Usuario> utv;
    @FXML
    private TableColumn<Usuario, String> utbc;
    @FXML
    private TableView<Mensaje> mtv;
    @FXML
    private TableColumn<Mensaje, String>  mutbc;
    @FXML
    private TableColumn<Mensaje, String> mmtbc;
    @FXML
    private TableColumn<Mensaje, String> mhtbc;
    @FXML
    private TextArea mensajeta;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("inicio");
    }
    
}