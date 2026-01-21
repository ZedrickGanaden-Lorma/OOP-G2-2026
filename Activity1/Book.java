public class Book {
    public Book() {
    }

    public Book(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pubDate = publicationDate;
    }

    String title;
    String author;
    String isbn;
    String pubDate;

    public void printBookInfo() {
        System.out.println("Title            : " + title);
        System.out.println("Author           : " + author);
        System.out.println("ISBN             : " + isbn);
        System.out.println("Publication Date : " + pubDate);
    }
}
