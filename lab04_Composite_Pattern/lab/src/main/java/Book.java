public class Book extends ProductComponent{

    private String isbn;

    public Book(String title, String isbn) {
        super(title);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void print() {
        System.out.println("Book - title: " + title + " - isbn: " + isbn);
    }

}
