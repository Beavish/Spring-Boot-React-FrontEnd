package com.kieran.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {
	
	@Id
	private Long id;
	
	private String name;
	
	/* this relationship breaks the application but why?
	 * 
	@ManyToOne(cascade=CascadeType.PERSIST)// many categories can be connected to one user. persist means what happens to the tables in the DB
	private User user;
	*/
}
