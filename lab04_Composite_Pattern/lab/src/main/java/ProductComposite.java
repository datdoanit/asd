import java.util.ArrayList;
import java.util.List;

public abstract class ProductComposite extends ProductComponent{

	protected final List<ProductComponent> components = new ArrayList<>();

	public ProductComposite(String title) {
		super(title);
	}

	public void addComponent(ProductComponent component) {
		components.add(component);
	}

	@Override
	public void print() {
		System.out.println("Title: " + title + ". List of components: ");
		components.stream().forEach(ProductComponent::print);
	}
}
