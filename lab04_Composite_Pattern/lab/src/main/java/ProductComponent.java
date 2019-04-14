
public abstract class ProductComponent {
	protected String title;

	public ProductComponent(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void print();

}
