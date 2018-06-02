package parcial.desing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

		
	public static void main(String[] args) throws Exception {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Compra compra = (Compra) context.getBean("Compra");
		compra.comprar();
	}

}