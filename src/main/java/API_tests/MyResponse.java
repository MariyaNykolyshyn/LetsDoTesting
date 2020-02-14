package API_tests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.awt.print.Book;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyResponse {
    private String name;
    private String location;
    private int age;
    private List<Book>books;

    public List<Book> getBooks() {
        return books;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }




}
