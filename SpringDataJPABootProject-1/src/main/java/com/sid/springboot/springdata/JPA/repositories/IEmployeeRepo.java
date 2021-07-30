/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.componentMapping.Employee;

/**
 * @author Lenovo
 *
 */
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
