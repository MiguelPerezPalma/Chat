package UA1.Chat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class PrimaryController {

	@FXML
	private TextField NickTexF;
	@FXML
	private ChoiceBox<String> SalaCB;
	@FXML
	private MenuItem con;
    @FXML
    private void switchToGestionarTablas() throws IOException {
        App.setRoot("crearSala");
    }
    
}
