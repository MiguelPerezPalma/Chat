package UA1.Chat.modelo.Sala;

import java.util.List;

import UA1.Chat.modelo.Mensaje.Mensaje;
import UA1.Chat.modelo.Usuario.Usuario;

public class SalaDAO extends Sala{

	public SalaDAO() {
		super();
		
	}

	public SalaDAO(String nombre, List<Mensaje> mensajes, List<Usuario> users) {
		super(nombre, nombre, mensajes, users);
		
	}
	public SalaDAO(Sala s) {
		this.id=s.getId();
		this.mensajes=s.getMensajes();
		this.nombre=s.getNombre();
		this.users=s.getUsers();
	}
	
	public int guardar() {
		return 0;
	}
	
	public int borrar() {
		return 0;
	}
	
}
