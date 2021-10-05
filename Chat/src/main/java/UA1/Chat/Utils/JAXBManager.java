package UA1.Chat.Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import UA1.Chat.modelo.Sala.SalaList;

public class JAXBManager {
	public static void marshal(SalaList s,String f) throws IOException, JAXBException {
		marshal(s, new File(f));
	}
	
	public static void marshal(SalaList s, File f) throws IOException, JAXBException {
		BufferedWriter writer=new BufferedWriter(new FileWriter(f));
		JAXBContext context=JAXBContext.newInstance(SalaList.class);
		Marshaller m= context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		m.marshal(s, writer);
		writer.close();
	}
	public static void unmarshal( File f) {
		

	}
}
