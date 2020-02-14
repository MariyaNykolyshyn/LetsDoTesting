package API_tests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Books{///if THIS CLASS IS EXISTING BY DEFAULD WHY WOULD i CREATE IT?

    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

