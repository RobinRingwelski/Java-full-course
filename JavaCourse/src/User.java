public class User {

    String username;
    String email;
    int age;


    // Multiple constructors by having different parameters.
    // In this example I add a new parameter for each User constructor
    // It's kinda similar to overloaded methods.
    User(){
        this.username = "Guest";
        this.email = "Empty";
        this.age = 0;
    }

    User(String username){
        this.username = username;
        this.email = "Empty";
        this.age = 0;
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
