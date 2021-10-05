package UA1.Chat.modelo.Mensaje;

import java.time.LocalDateTime;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Mensaje")
public class Mensaje {
	protected String info;
	protected LocalDateTime hmensaje;
	public Mensaje(String info, LocalDateTime hmensaje) {
		super();
		this.info = info;
		this.hmensaje = hmensaje;
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
	
	
}
