/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.Image;

/**
 * @author Lenovo
 *
 */
public interface IMageDBRepo extends CrudRepository<Image, Integer> {

}
