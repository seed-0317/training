package marshaling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLMarshalExample {
	public static void main(String[] args) throws JAXBException {
		String filename = "src/main/java/marshaling/xmlExample.txt";
		write(filename);
	}
	
	public static void write(String filename) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Car.class);
		Marshaller marshaller = context.createMarshaller();
		
		// output pretty printed
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Car car = new Car("Jeep", "Wrangler", "blue");
		marshaller.marshal(car, new File(filename));
	}

}
