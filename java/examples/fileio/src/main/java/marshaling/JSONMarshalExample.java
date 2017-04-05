package marshaling;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONMarshalExample {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		String filename = "src/main/java/marshaling/jsonExample.txt";
		write(filename);
	}
	
	public static void write(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), new Car("Jeep", "Wrangler", "blue"));
	}
}
