package classeswithAtributes;

public class Product {
	
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getDescription() {
		return description;
	}
	private void setDescription(String description) {
		this.description = description;
	}
	private double getPrice() {
		return price;
	}
	private void setPrice(double price) {
		this.price = price;
	}
	private int getStockAmount() {
		return stockAmount;
	}
	private void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	

}
