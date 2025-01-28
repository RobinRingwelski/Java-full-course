
public class Main {

    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Robin", "Ringwelski");
        Student student = new Student("Bob", "Petersen", 4.0);
        Employee employee = new Employee("Spongebob", "Squarepants", 20000);

        person.showName();
        student.showName();
        student.showGpa();
        employee.showSalary();


    }

}
