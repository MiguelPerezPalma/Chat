package UA1.Chat;

import java.io.IOException;
import java.util.List;

import UA1.Chat.Utils.JAXBManager;
import UA1.Chat.modelo.Sala.Sala;

import UA1.Chat.modelo.Sala.SalaList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class PrimaryController {

	@FXML
	private TextField NickTexF;
	@FXML
	private ComboBox<String> SalaCB;
	@FXML
	private MenuItem con;
	
	private SalaList sls;
    @FXML
    protected void initialize() {
    	
    	
    }
	
    @FXML
    private void switchToGestionarTablas() throws IOException {
        App.setRoot("crearSala");
    }
    
}
