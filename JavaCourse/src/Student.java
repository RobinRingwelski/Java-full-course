public class Student {

    // data types
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // This is the constructor for Student
    Student(String name, int age, double gpa, boolean isEnrolled){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
        // The "this" naming will be replaced by the name of the object such as student1 or student2
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

}
