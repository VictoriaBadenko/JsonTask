package readJson;

import classes.ApplicationDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonParseHelper {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ApplicationDto websites = null;
        try {
            File json = new File("src\\main\\resources\\test.json");
            websites = mapper.readValue(json, ApplicationDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(websites);
    }
}
