// Method 3 : using appropriate functions instead of getters and setters

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public void updatePersonInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Prashant Kumar", 23);
        person.displayPersonInfo();

        person.updatePersonInfo("Sonu Ranjan", 25);
        person.displayPersonInfo();
    }
}
