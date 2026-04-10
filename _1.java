
// package Assignment_1;

// 1.Create a class called Person with name (String) and age (int) attributes. Implement
// a constructor to set these attributes upon object creation. Create two Person objects,
// set their details, and print them.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class _1First {
    public static void main(String[] args) {
        Person p1 = new Person("Muneebur Rahman", 19);
        Person p2 = new Person("Noman Raza", 21);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}
