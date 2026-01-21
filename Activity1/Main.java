
public class Main {
    public static void main(String[] args) {
        Book halo = new Book(
                "Halo: The Fall of Reach",
                "Eric Nylund",
                "978-0765367297",
                "October 30, 2001");
        halo.printBookInfo();

        Book harryPotter = new Book();
        harryPotter.title = "Harry Potter and the Philosopher's Stone";
        harryPotter.author = "J. K. Rowling";
        harryPotter.isbn = "0-590-35340-3";
        harryPotter.pubDate = "June 26, 1997";
    }
}
