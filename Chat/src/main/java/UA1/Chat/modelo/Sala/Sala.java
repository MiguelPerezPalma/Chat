package UA1.Chat.modelo.Sala;

import java.util.List;



import UA1.Chat.modelo.Mensaje.Mensaje;
import UA1.Chat.modelo.Usuario.Usuario;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Sala")
public class Sala {
	@XmlAttribute(name = "nombre")
	protected String nombre;
	@XmlElement(name = "Mensaje", type = Mensaje.class)
	protected List<Mensaje> mensajes;
	@XmlElement(name = "Usuario", type = Usuario.class)
	protected List<Usuario> users;
	public Sala( String nombre, List<Mensaje> mensajes, List<Usuario> users) {
		super();
		
		this.nombre = nombre;
		this.mensajes = mensajes;
		this.users = users;
	}
	public Sala() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	public List<Usuario> getUsers() {
		return users;
	}
	public void setUsers(List<Usuario> users) {
		this.users = users;
	}
	
	
}
