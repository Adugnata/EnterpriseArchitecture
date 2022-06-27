package edu.miu.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private IProductDAO productDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productDao.clearDB();
		Product product1 = new Product("123","Keyboard",20);
		product1.setSupplier(new Supplier("xy","12345"));
		Product product2 = new Product("456","water",2);
		product2.setSupplier(new Supplier("ZA","56789"));
		productDao.save(product1);
		productDao.save(product2);
		System.out.println("----------- product by product number -------");
	System.out.println(productDao.getSupplierNumber("123"));
		System.out.println("----------- product by name ----------------");
	System.out.println(productDao.findByProductName("water"));
		System.out.println("-----------All products ----------------");
		System.out.println(productDao.getAllProducts());
		productDao.removeProduct("456");

	}
}
