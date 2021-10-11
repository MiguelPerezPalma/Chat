package UA1.Chat.modelo.Sala;

import java.util.List;

import UA1.Chat.modelo.Mensaje.Mensaje;
import UA1.Chat.modelo.Usuario.Usuario;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class SalaDAO extends Sala{

	public SalaDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaDAO(String nombre, List<Mensaje> mensajes, List<Usuario> users) {
		super(nombre, mensajes, users);
		// TODO Auto-generated constructor stub
	}

	public int guardar() {
		int result=0;
		
		return result;
	}
	
	public int eliminar() {
		int result=0;
		
		return result;
	}
}
