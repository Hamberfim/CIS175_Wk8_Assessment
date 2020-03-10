package italian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import italian.beans.Product;
import italian.beans.ProductContainerPackaging;
import italian.controller.BeanConfiguration;
import italian.repository.ProductRepository;

@SpringBootApplication
public class SpringProductCatWk8AssessmentApplication implements CommandLineRunner {

	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(SpringProductCatWk8AssessmentApplication.class, args);
	 * 
	 * ApplicationContext appContext= new
	 * AnnotationConfigApplicationContext(BeanConfiguration.class);
	 * 
	 * Product p = appContext.getBean("product", Product.class);
	 * 
	 * System.out.println(p.toString());
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProductCatWk8AssessmentApplication.class, args);
	}
	
	@Autowired
	ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Using an existing bean   
		Product prdCat = appContext.getBean("product", Product.class);   
		prdCat.setCategory("perishable");   
		repo.save(prdCat);      
		
		//Creating a bean to use 1– not managed by Spring   
		Product prdItem1 = new Product("Balsamic Vinegar of Modena D.O.P. - Gold Cap", 230.00, 15, "vinegar");   
		ProductContainerPackaging prdPkgType = new ProductContainerPackaging("Glass Bottle", "3.5 fl.oz."); 
		
		prdItem1.setProductcontainerpackaging(prdPkgType );  
		repo.save(prdItem1);
		
		// Create another bean to use 2
		Product prdItem2 = new Product("Grangusto Whole red Datterino Tomatoes", 4.49, 48, "tomatoes");   
		ProductContainerPackaging prdPkgType2 = new ProductContainerPackaging("Tin Can", "14.10 oz."); 
		
		prdItem2.setProductcontainerpackaging(prdPkgType2);  
		repo.save(prdItem2);
		
		// Create another bean to use 3
		Product prdItem3 = new Product("Sicilia cream pistachio pesto - Vincente", 12.99, 125, "pates & pestos");   
		ProductContainerPackaging prdPkgType3 = new ProductContainerPackaging("Glass Jar", "7.05 oz."); 
				
		prdItem3.setProductcontainerpackaging(prdPkgType3);  
		repo.save(prdItem3);
		
		
		List<Product> allMyProducts = repo.findAll();   
		for(Product item: allMyProducts) {    
			System.out.println(item.toString());  
				
	}
		((AbstractApplicationContext)appContext).close();

	}
}
