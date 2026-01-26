package pack1;

public class Document {

    String title;
    Person[] authors = new Person[5];
    int authorCount = 0;

    public Document(String title) {
        this.title = title;
    }

    public void addAuthor(Person p) {
        if (authorCount < 5) {
            authors[authorCount] = p;
            authorCount++;
        }
    }

    public int NbAuthor() {
        return authorCount;
    }

    @Override
    public String toString() {
        String result = "Title: " + title + "\nAuthors:\n";
        for (int i = 0; i < authorCount; i++) {
            result += "- " + authors[i] + "\n";
        }
        return result;
    }
}
