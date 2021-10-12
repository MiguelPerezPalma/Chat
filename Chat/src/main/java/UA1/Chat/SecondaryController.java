package UA1.Chat;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import UA1.Chat.Utils.conviertefecha;
import UA1.Chat.modelo.Mensaje.Mensaje;
import UA1.Chat.modelo.Usuario.Usuario;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.util.converter.LocalDateStringConverter;

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
    @FXML
    protected void initialize() {
    	configuratable();
    	
    }
    
    private void configuratable() {
    	mutbc.setCellValueFactory(cadaentrada->{
    		SimpleStringProperty v=new SimpleStringProperty();
    		v.setValue(cadaentrada.getValue().getUsario().getNickname());
    		return v;
    	});
    	mmtbc.setCellValueFactory(cadaentrada->{
    		SimpleStringProperty v=new SimpleStringProperty();
    		v.setValue(cadaentrada.getValue().getInfo());
    		return v;
    	});
    	mhtbc.setCellValueFactory(cadaentrada->{
    		SimpleStringProperty v=new SimpleStringProperty();		
    		v.setValue(conviertefecha.LocalDateToString(cadaentrada.getValue().getHmensaje()));
    		return v;
    	});
    	
    }
    
    

}