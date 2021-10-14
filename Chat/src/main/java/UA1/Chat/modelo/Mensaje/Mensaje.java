package UA1.Chat.modelo.Mensaje;

import java.time.LocalDateTime;

import UA1.Chat.modelo.Usuario.Usuario;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Mensaje")
public class Mensaje {
	@XmlElement
	protected String info;
	@XmlValue
	protected LocalDateTime hmensaje;
	@XmlAttribute(name="Usuario")
	protected Usuario usario; 
	

	public Mensaje(String info, LocalDateTime hmensaje, Usuario usario) {
		super();
		this.info = info;
		this.hmensaje = hmensaje;
		this.usario = usario;
	}
	public Mensaje() {
		super();
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public LocalDateTime getHmensaje() {
		return hmensaje;
	}
	public void setHmensaje(LocalDateTime hmensaje) {
		this.hmensaje = hmensaje;
	}
	public Usuario getUsario() {
		return usario;
	}
	public void setUsario(Usuario usario) {
		this.usario = usario;
	}
	
	
	
}
