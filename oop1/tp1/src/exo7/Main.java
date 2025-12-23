

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Person f = new Person();
        p.displayInfo();
        f.displayInfo();

        p.firstName = "natsu";
        p.lastName = "dragnil";
        p.age = 19;
        p.displayInfo();

        Teacher t = new Teacher();
        t.displayInfo();
        t.firstName = "anyname";
        t.lastName = "anyname";
        t.model = "poo";
        t.displayInfo();

    }

}
