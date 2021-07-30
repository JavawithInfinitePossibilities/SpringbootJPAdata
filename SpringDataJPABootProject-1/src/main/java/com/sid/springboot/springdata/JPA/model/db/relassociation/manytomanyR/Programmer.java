/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.relassociation.manytomanyR;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author Lenovo
 *
 */
@Entity
public class Programmer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pgrmid;
	private String name;
	private int salary;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "programmer_project", 
	joinColumns = @JoinColumn(referencedColumnName = "pgrmid"), 
	inverseJoinColumns = @JoinColumn(referencedColumnName = "pjid"))
	private List<Project> projects;

	/**
	 * 
	 */
	public Programmer() {
		super();
	}

	/**
	 * @param name
	 * @param salary
	 * @param projects
	 */
	public Programmer(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @return the pgrmid
	 */
	public int getPgrmid() {
		return pgrmid;
	}

	/**
	 * @param pgrmid the pgrmid to set
	 */
	public void setPgrmid(int pgrmid) {
		this.pgrmid = pgrmid;
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
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the projects
	 */
	public List<Project> getProjects() {
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void addProject(Project project) {
		if (project != null) {
			if (projects == null) {
				projects = new ArrayList<Project>();
			}
			projects.add(project);
		}
	}

	@Override
	public String toString() {
		return "Programmer [pgrmid=" + pgrmid + ", name=" + name + ", salary=" + salary + "]";
	}

}
