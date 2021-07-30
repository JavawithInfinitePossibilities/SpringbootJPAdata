/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation.manytomanyR;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.relassociation.manytomanyR.Project;

/**
 * @author Lenovo
 *
 */
public interface IProjectRepo extends CrudRepository<Project, Integer> {

}
