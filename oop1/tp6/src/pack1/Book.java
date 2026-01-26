package pack1;

public class Book extends Document {

    String ISBN;
    double price;
    int yearOfPub;

    public Book(String title, String ISBN, double price, int yearOfPub) {
        super(title);
        this.ISBN = ISBN;
        this.price = price;
        this.yearOfPub = yearOfPub;
    }

    @Override
    public String toString() {
        return super.toString()
                + "ISBN: " + ISBN + "\n"
                + "Publication Year: " + yearOfPub;
    }

    public void SalePrice(Person buyer) {

        for (int i = 0; i < authorCount; i++) {
            if (authors[i] == buyer) {
                System.out.println("Book is free for the author.");
                return;
            }
        }

        int age = 2025 - buyer.birthYear;
        double finalPrice = price;

        if (age < 20) {
            finalPrice *= 0.8;
        }

        System.out.println("Sale price for " + buyer.firstName + ": " + finalPrice);
    }
}



