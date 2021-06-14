package classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplicationDto {
    @JsonProperty("websites")
    List<Map<String, WebsiteDto>> websites = new ArrayList<Map<String, WebsiteDto>>();

    public ApplicationDto() {
    }

    public List<Map<String, WebsiteDto>> getApplicationDto() {
        return websites;
    }

    public void setApplicationDto(List<Map<String, WebsiteDto>> websites) {
        this.websites = websites;
    }
}
