package com.kieran.expense.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Declares that this is a table to be created in our Database
@AllArgsConstructor // creates a constructor for all the args that we've listed
@NoArgsConstructor // a no ARGS constructor is required for JPA- it will throw and error without it // lombok
@Data // handles creation of all the setters and getters using Lombok
@Table(name="user") // Lets us name our table, but if we ignore this it will use the class name
public class User {
	
	@Id // declare this value to be used as a primary key
	private long id;
	
	private String name;
	
	private String email;
	
	@OneToMany// Entity Relationship , one user can have multiple categories 
	private Set<Category> category;
	
}
