package UA1.Chat.modelo.Usuario;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Usuario")
public class Usuario {
	protected String nickname;

	public Usuario(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Usuario() {
		super();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	 
}
