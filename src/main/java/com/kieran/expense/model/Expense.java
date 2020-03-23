package com.kieran.expense.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="expense")
public class Expense {
	
	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String description;
	
	private String location;
	
	@ManyToOne // many expenses to one category
	private Category category;
	
	@JsonIgnore
	@ManyToOne // many expenses to one user
	private User user;
	

}
