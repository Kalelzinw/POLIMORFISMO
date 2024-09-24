package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	protected Double price;

	List<Product> list = new ArrayList<>();

	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Product> getList() {
		return list;
	}

	public void addProduct(Product product) {
		list.add(product);
	}

	public void removeProduct(Product product) {
		list.remove(product);
	}

	@Override
	public String toString() {
		return getName() + " $" + String.format("%.2f", getPrice());
	}

	public String displayProducts() {
		StringBuilder sb = new StringBuilder();
		sb.append("PRICE TAGS:\n");
		for (Product p : list) {
			sb.append(p + "\n");
		}
		return sb.toString();
	}

}
