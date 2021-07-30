/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.Vehicle;

/**
 * @author Lenovo
 *
 */
public interface IVehicleRepo extends CrudRepository<Vehicle, Integer> {

}
