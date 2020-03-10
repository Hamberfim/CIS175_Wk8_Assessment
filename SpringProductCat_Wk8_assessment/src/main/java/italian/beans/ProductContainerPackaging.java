package italian.beans;

import javax.persistence.Embeddable;

@Embeddable
public class ProductContainerPackaging {
	
	private String prdContainerType;
	private String prdContainerSize;
	
	
	public ProductContainerPackaging() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductContainerPackaging(String prdContainerType, String prdContainerSize) {
		super();
		this.prdContainerType = prdContainerType;
		this.prdContainerSize = prdContainerSize;
	}


	
	public String getPrdContainerType() {
		return prdContainerType;
	}


	public void setPrdContainerType(String prdContainerType) {
		this.prdContainerType = prdContainerType;
	}


	public String getPrdContainerSize() {
		return prdContainerSize;
	}


	public void setPrdContainerSize(String prdContainerSize) {
		this.prdContainerSize = prdContainerSize;
	}


	
	@Override
	public String toString() {
		return "ProductContainerPackaging [prdContainerType=" + prdContainerType + ", prdContainerSize="
				+ prdContainerSize + "]";
	}
	
}
