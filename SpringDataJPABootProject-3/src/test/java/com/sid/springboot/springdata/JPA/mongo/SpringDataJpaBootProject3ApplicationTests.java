package com.sid.springboot.springdata.JPA.mongo;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.springboot.springdata.JPA.mongo.model.db.Product;
import com.sid.springboot.springdata.JPA.mongo.repositories.IProductMogRepo;

@SpringBootTest
class SpringDataJpaBootProject3ApplicationTests {

	@Autowired
	private IProductMogRepo iProductMogRepo;

	@Disabled
	@Test
	void testProductLoads() {
		Product product = new Product();
		product.setName("orange");
		product.setPrice(1000d);

		Product saveProduct = iProductMogRepo.save(product);
		System.out.println("Save product: " + saveProduct.getId());
	}

	@Disabled
	@Test
	public void testFindAll() {
		List<Product> findAll = iProductMogRepo.findAll();
		findAll.stream().forEach(p -> {
			System.out.println(p.getName());
		});
	}

	@Disabled
	@Test
	public void testDeleteAll() {
		iProductMogRepo.deleteById("5f774d2acc50c570a29cc8e9");
	}
}
