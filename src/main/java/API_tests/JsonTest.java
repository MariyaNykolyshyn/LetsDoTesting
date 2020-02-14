package API_tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;


public class JsonTest {
  //  @Test
    public void jsonTest() throws Exception {
        User user = new User();
        user.setAge(22);
        user.setLocation("New York");
        user.setName("James");

//Converting from Java Object to JSon Format
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        //Converting from JSon Format to Java Object
        //User user2 = mapper.readValue(json, User.class);//   System.out.println(user2.getLocation());
    }
//        @Test
//        public void utilTest(){
//        ServiceRunner.runGetRequest("http://localhost:3000/profile");
//        String location = ServiceRunner.getResponse().getLocation();
//        System.out.println(location);
//        for(Books book:ServiceRunner.getResponse().getBooks()){
//            System.out.println(Books.getTitle() =null);
//        }

    @Test
    public void utlTestPost(){
        MyRequest mr = new MyRequest();
        mr.setAge(44);
        mr.setLocation("Nashville,TN");

        ServiceRunner.runPostRequest("http://localhost:3000/profile",mr);
        String location = ServiceRunner.getResponse().getLocation();
        System.out.println(location);

    }
}
