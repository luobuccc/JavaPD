import java.util.*;

/**
 * Created by PuFan on 2016/12/16.
 */
public class P20161216_3 {
    public static void main(String[] args) {
        Book booklist[] = {
                new Book("1001", "A", "M", new Date(System.nanoTime()), 200),
                new Book("1002", "A", "W", new Date(), 2001),
                new Book("1003", "C", "X", new Date(), 2002),
                new Book("1004", "B", "X", new Date(), 2016),
                new Book("1005", "D", "M", new Date(), 2015),
        };
        HashMap<String, Book> HM = new HashMap<>();
        for (int i = 0; i < booklist.length; ++i)
            HM.put(booklist[i].getISBN(), booklist[i]);
        System.out.println(HM);
        System.out.println();
        for (String key : HM.keySet()) {
            System.out.println("key= " + key + " and value= " + HM.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Book> entry : HM.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        System.out.println();
        Iterator<Map.Entry<String, Book>> I = HM.entrySet().iterator();
        while (I.hasNext())
            System.out.println(I.next());

    }
}

class Book {
    private String ISBN;
    private String title;
    private String author;
    private Date pubDate;
    private double price;

    public Book(String ISBN, String title, String author, Date pubDate, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubDate=" + pubDate +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
