/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sid.springboot.springdata.JPA.model.db.Product;

/**
 * @author Lenovo
 *
 */
public interface IProductRepo extends PagingAndSortingRepository<Product, Integer> {

	public List<Product> findByName(String name);

	public List<Product> findByNameAndDescription(String name, String description);

	public List<Product> findByPriceGreaterThanEqual(double price);

	public List<Product> findByNameLike(String name, Pageable pageable);
}
