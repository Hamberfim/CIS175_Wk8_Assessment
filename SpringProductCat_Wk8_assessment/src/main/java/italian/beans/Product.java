package italian.beans;

public class Product {
	// Anthony Hamlin
	
	private long id;
	private String productName;
	private double pricePerUnit;
	private int inStockQty;
	private String category;
	
	
	public Product() {
		super();
		this.category = "perishable food";
	}

	public Product(String productName) {
		super();
		this.productName = productName;
	}

	public Product(long id, String productName, double pricePerUnit, int inStockQty, String category) {
		super();
		this.id = id;
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.inStockQty = inStockQty;
		this.category = category;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getInStockQty() {
		return inStockQty;
	}

	public void setInStockQty(int inStockQty) {
		this.inStockQty = inStockQty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", pricePerUnit=" + pricePerUnit + ", inStockQty="
				+ inStockQty + ", category=" + category + "]";
	}


}
