package com.kieran.expense.contoller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kieran.expense.model.Category;
import com.kieran.expense.repository.CategoryRepository;



@RestController
@RequestMapping(value="/api") // this is the base URL for our controller API. everything will be localhost:8080/api/xxx
// 
public class CategoryController {
	
	@Autowired // dependency injection for the DB interface
	private CategoryRepository categoryRepository;
	
	@GetMapping("/categories")
	public Collection<Category>categories(){
		return categoryRepository.findAll();
		// Select * From Category and gimme the result
	}
	
	@GetMapping("/categories/{id}")
	public Optional<Category> getCategory(@PathVariable Long id){
		return categoryRepository.findById(id);
	}
	
	@PostMapping("/category")
	public void addCategory(@RequestBody Category cat) {
		categoryRepository.save(cat);
	}
	
	@PutMapping("/category/{id}")
	public void updateCategory(@RequestBody Category cat,@PathVariable Long id) {
		categoryRepository.save(cat);
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable Long id){
		categoryRepository.deleteById(id);
		
	}
	

}
