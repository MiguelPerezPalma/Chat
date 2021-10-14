package UA1.Chat;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import UA1.Chat.Utils.JAXBManager;
import UA1.Chat.Utils.conviertefecha;
import UA1.Chat.modelo.Mensaje.Mensaje;
import UA1.Chat.modelo.Sala.Sala;
import UA1.Chat.modelo.Usuario.Usuario;
import jakarta.xml.bind.JAXBException;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
	private static Usuario us;
	private static Sala sa;
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("inicio");
    }
    @FXML
    protected void initialize() {
    	configuratable();
    	
    }
    
    private void configuratable() {
    	utbc.setCellValueFactory(cadaentrada->{
    		SimpleStringProperty v=new SimpleStringProperty();
    		v.setValue(cadaentrada.getValue().getNickname());
    		return v;
    	});
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
    @FXML
    private void enviarmensaje() {
    	if(!mensajeta.getText().isEmpty()&& !mensajeta.getText().isBlank()) {
    		Mensaje m=new Mensaje(mensajeta.getText(), LocalDateTime.now(), us);
    		sa.addMensaje(m);
    	}
    }
    
    @FXML
    private void cerrarsesion() throws IOException, JAXBException {
    	us=null;
    	JAXBManager.saveFile(JAXBManager.getSalaList());
    	App.setRoot("primary");
    }
    
    public static  void crearSala(Usuario u, Sala s) {
    	sa=s;
    	us=u;
    }

}