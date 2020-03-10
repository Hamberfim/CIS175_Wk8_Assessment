package italian.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import italian.beans.Product;


@Configuration
public class BeanConfiguration {
	
	@Bean
	public Product product() {
		Product bean = new Product();
		bean.setProductName("Balsamic Vinegar of Modena D.O.P. - Gold Cap");
		bean.setCategory("vinegars");
		bean.setInStockQty(15);
		bean.setPricePerUnit(230.00);
		return bean;
	}

}
