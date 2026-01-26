package pack1;

public class Main {

    public static void main(String[] args) {

        Person a1 = new Person("Ali", "Benali", 1980);
        Person a2 = new Person("Sara", "Khaldi", 1995);
        Person buyer = new Person("Yacine", "Amar", 2008);

        Book book = new Book("Java Basics", "ISBN-001", 100.0, 2023);

        book.addAuthor(a1);
        book.addAuthor(a2);

        System.out.println(book);
        System.out.println("Number of authors: " + book.NbAuthor());

        book.SalePrice(buyer); 
        book.SalePrice(a1);    
    }
}
