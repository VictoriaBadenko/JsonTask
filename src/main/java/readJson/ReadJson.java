package readJson;

import classes.Application;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJson {

    public Application readJson() {
        ObjectMapper mapper = new ObjectMapper();
        Application application = null;
        try {
            File json = new File("src\\main\\resources\\test.json");
            application = mapper.readValue(json, Application.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return application;
    }

}
