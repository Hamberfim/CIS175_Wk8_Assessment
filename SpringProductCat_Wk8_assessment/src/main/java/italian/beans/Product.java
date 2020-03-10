package italian.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Product {
	// Anthony Hamlin
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String productName;
	private double pricePerUnit;
	private int inStockQty;
	private String category;
	
	@Autowired
	private ProductContainerPackaging productcontainerpackaging;
	
	
	public Product() {
		super();
		this.category = "perishable food";
	}

	public Product(String productName) {
		super();
		this.productName = productName;
	}
	
	public Product(String productName, double pricePerUnit, int inStockQty, String category) {
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.inStockQty = inStockQty;
		this.category = category;
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
	
	public ProductContainerPackaging getProductcontainerpackaging() {
		return productcontainerpackaging;
	}

	public void setProductcontainerpackaging(ProductContainerPackaging productcontainerpackaging) {
		this.productcontainerpackaging = productcontainerpackaging;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", pricePerUnit=" + pricePerUnit + ", inStockQty="
				+ inStockQty + ", category=" + category + ", productcontainerpackaging=" + productcontainerpackaging
				+ "]";
	}
	

}
