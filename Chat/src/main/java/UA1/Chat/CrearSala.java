package UA1.Chat;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CrearSala {
	@FXML
	private TextField NickTexF;
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("inicio");
    }
	@FXML
	private ChoiceBox<String> SalaCB;
}
