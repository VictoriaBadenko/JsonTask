package readJson;

import classes.WebsiteDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonParseHelper {

    public static void readJson() {
        ObjectMapper mapper = new ObjectMapper();
        WebsiteDto website = null;
        try {
            File json = new File("src\\main\\resources\\test.json");
            website = mapper.readValue(json, WebsiteDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(website);
    }
}
