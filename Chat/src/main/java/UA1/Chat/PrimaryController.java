package UA1.Chat;

import java.io.IOException;
import java.util.List;

import UA1.Chat.Utils.JAXBManager;
import UA1.Chat.modelo.Sala.Sala;

import UA1.Chat.modelo.Sala.SalaList;
import UA1.Chat.modelo.Usuario.Usuario;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class PrimaryController {

	@FXML
	private TextField NickTexF;
	@FXML
	private ComboBox<Sala> SalaCB;
	@FXML
	private MenuItem con;
	

	
    @FXML
    protected void initialize() {
    	SalaCB.setItems((ObservableList<Sala>) JAXBManager.getSalaList().getSalas());
    	
    }
	
    @FXML
    private void switchToGestionarTablas() throws IOException {
        App.setRoot("crearSala");
    }
    
    @FXML
    private void switchToSecondaryController() throws IOException {
        if(!SalaCB.getItems().isEmpty()&&!NickTexF.getText().isEmpty()) {
        	Usuario u=new Usuario(NickTexF.getText());
        	SecondaryController.crearSala(u, SalaCB.getValue());
        	App.setRoot("secondary");
        }
        
    }
}
