package Oops_;

class Person {
    private String name;

    // Constructor with parameter having same name as instance variable
    public Person(String name) {
        this.name = name;  // 'this.name' refers to the instance variable
    }

    public void display() {
        System.out.println("Name: " + this.name);  // Using 'this' for clarity
    }
}

public class this_keyword {
    public static void main(String[] args) {
        Person p = new Person ("Hitesh sir ");
        p.display();
    }
}