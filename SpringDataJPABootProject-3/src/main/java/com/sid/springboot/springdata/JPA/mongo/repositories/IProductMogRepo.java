/**
 * 
 */
package com.sid.springboot.springdata.JPA.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sid.springboot.springdata.JPA.mongo.model.db.Product;

/**
 * @author Lenovo
 *
 */
public interface IProductMogRepo extends MongoRepository<Product, String> {

}
