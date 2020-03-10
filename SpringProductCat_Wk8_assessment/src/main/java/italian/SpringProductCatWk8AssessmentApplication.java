package italian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import italian.beans.Product;
import italian.controller.BeanConfiguration;

@SpringBootApplication
public class SpringProductCatWk8AssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductCatWk8AssessmentApplication.class, args);
		
		ApplicationContext appContext= new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Product p = appContext.getBean("product", Product.class);
		
		System.out.println(p.toString());
		
	}

}
