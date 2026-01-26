package pack2;

public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer("Ali", "Benali", 2018, 45);
        Marketer mark = new Marketer("Sara", "Khaldi", 2020, 3000);

        System.out.println(dev.toString());
        System.out.println(mark.toString());
    }
}

