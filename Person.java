
/*In this example, the Person class defines a method called printClass()
    that prints the name of the class of the object that it is called on. */

public class Person {
    private String name;
    private int age;

    // constructor and getters/setters omitted for brevity

    public void printClass() {
        System.out.println("Class of this object: " + getClass().getName());
    }
}
