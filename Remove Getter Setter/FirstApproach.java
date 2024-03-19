// Method-1: using public data members instead of private data member

public class Person {
    public String name;
    public int age;
}

public class FirstApproach {
    public static void main(String[] args) {
        Person men = new Person();
        men.name = "Prashant Kumar";
        men.age  = 23;

        System.out.println("Name : " +men.name);
        System.out.println("Age :" +men.age);

    }

}