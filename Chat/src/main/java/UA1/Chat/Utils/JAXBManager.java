package UA1.Chat.Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import UA1.Chat.modelo.Sala.Sala;
import UA1.Chat.modelo.Sala.SalaList;

public class JAXBManager {
	private static String file;
	private static SalaList sls;

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

	
	public static void readXML(String url) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SalaList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			SalaList sl = (SalaList) jaxbUnmarshaller.unmarshal(new File(url));
			System.out.println("unmarshal:");
			System.out.println(sl);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static SalaList getSalaList() {
        return sls;
    }
	
	public static void saveFile(SalaList sl) throws IOException, JAXBException {
		marshal(sl, new File(file));
	}
    public static SalaList loadFile(File f) throws IOException, JAXBException {
        SalaList result = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(f))) {
            JAXBContext jaxbC = JAXBContext.newInstance(SalaList.class);
            Unmarshaller un = jaxbC.createUnmarshaller();
            result = (SalaList) un.unmarshal(bf);
        } catch (IOException | JAXBException e) {
            saveFile(new SalaList());
        }
        return result == null ? new SalaList() : result;
    }
}
