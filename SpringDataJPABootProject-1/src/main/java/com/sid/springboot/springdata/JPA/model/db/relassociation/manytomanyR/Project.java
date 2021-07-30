/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.relassociation.manytomanyR;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Lenovo
 *
 */
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pjid;
	private String name;

	@ManyToMany(mappedBy = "projects")
	private List<Programmer> programmers;

	/**
	 * 
	 */
	public Project() {
		super();
	}

	/**
	 * @param name
	 * @param programmers
	 */
	public Project(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the pjid
	 */
	public int getPjid() {
		return pjid;
	}

	/**
	 * @param pjid the pjid to set
	 */
	public void setPjid(int pjid) {
		this.pjid = pjid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the programmers
	 */
	public List<Programmer> getProgrammers() {
		return programmers;
	}

	/**
	 * @param programmers the programmers to set
	 */
	public void setProgrammers(List<Programmer> programmers) {
		this.programmers = programmers;
	}

	public void addProgrammer(Programmer programmer) {
		if (programmer != null) {
			if (programmers == null) {
				programmers = new ArrayList<Programmer>();
			}
			programmers.add(programmer);
		}
	}

	@Override
	public String toString() {
		return "Project [pjid=" + pjid + ", name=" + name + "]";
	}

}
