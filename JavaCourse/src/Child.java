public class Child extends Parent {

    String firstname;
    String lastname;

    Child(String firstname, String lastname){
        super(firstname, lastname);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    void yelling(){
        System.out.println("The Child is yelling");
    }
}
