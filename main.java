class Person {
    protected String firstname;
    protected String secondname;

    public Person(String fname, String sname) {
        this.firstname = fname;
        this.secondname = sname;
    }

    public void printName() {
        System.out.println(firstname + " " + secondname);
    }
}

class Parent extends Person {
    public Parent(String fname, String sname) {
        super(fname, sname);
    }

    @Override
    public void printName() {
        System.out.println("Parent: " + firstname + " " + secondname);
    }
}

class Student extends Person {
    public Student(String fname, String sname) {
        super(fname, sname);
    }

    @Override
    public void printName() {
        System.out.println("Student: " + firstname + " " + secondname);
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Parent("John", "Doe");
        people[1] = new Student("Mary", "Doe");

        for (Person person : people) {
            person.printName();
        }
    }
}
