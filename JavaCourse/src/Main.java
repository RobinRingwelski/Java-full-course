
public class Main {

    public static void main(String[] args) {

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        // These are the student objects
        Student student1 = new Student("Spongebob", 30, 4.0, false);
        Student student2 = new Student("Robin", 20, 3.5, false);
        Student student3 = new Student("Simon", 22, 3.0, true);

        System.out.println(student1.name + " " + student1.age + " " + student1.gpa + " " + student1.isEnrolled);
        System.out.println(student2.name + " " + student2.age + " " + student2.gpa + " " + student2.isEnrolled);
        System.out.println(student3.name + " " + student3.age + " " + student3.gpa + " " + student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }

}
