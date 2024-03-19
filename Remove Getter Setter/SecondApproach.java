// Method-2: using constructor initialization

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        String name = "Prashant Kumar";
        int age = 23;

        Person person = new Person(name, age);
        person.displayPersonInfo();
    }
}

