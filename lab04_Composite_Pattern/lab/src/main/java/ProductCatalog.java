public class ProductCatalog{

    private final ProductComposite bookCategory;
    private final ProductComposite dvdCategory;

    public ProductCatalog(ProductComposite bookCategory, ProductComposite dvdCategory) {
        this.bookCategory = bookCategory;
        this.dvdCategory = dvdCategory;
    }

    public void print() {
        bookCategory.print();
        dvdCategory.print();
    }
}
