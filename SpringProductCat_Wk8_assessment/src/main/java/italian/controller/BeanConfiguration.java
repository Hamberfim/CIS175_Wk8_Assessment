package italian.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import italian.beans.Product;
import italian.beans.ProductContainerPackaging;


@Configuration
public class BeanConfiguration {
	
	@Bean
	public Product product() {
		Product bean = new Product();
		//bean.setProductName("Balsamic Vinegar of Modena D.O.P. - Gold Cap");
		//bean.setCategory("vinegars");
		//bean.setInStockQty(15);
		//bean.setPricePerUnit(230.00);
		return bean;
	}
	
	@Bean
	public ProductContainerPackaging productcontainerpackaging() {
		ProductContainerPackaging bean = new ProductContainerPackaging("Glass Bottle", "3.5 fl.oz.");
		return bean;
		
	}

}
