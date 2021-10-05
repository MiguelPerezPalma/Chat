package UA1.Chat.modelo.Sala;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="SalaList")
public class SalaList {
	@XmlElement(name = "Sala", type = Sala.class)
	private List<Sala> salas=new ArrayList<>();

	public SalaList(List<Sala> salas) {
		super();
		this.salas = salas;
	}

	public SalaList() {
		super();
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	
}
