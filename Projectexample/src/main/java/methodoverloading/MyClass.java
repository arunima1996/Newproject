package methodoverloading;

public class MyClass {
    private String name;
    private int age;

    public MyClass() {
        this.name = "Anu";
        this.age = 20;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Creating an object using default constructor
        System.out.println("Initial information:");
        obj.displayInfo(); // Displaying initial information
        obj.setName("John"); // Setting new name
        obj.setAge(25); // Setting new age
        System.out.println("\nUpdated information:");
        obj.displayInfo(); // Displaying updated information
    }




}
