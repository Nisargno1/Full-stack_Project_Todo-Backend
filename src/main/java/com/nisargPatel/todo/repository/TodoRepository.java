package com.nisargPatel.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisargPatel.todo.Model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

	List<Todo> findAll();
	
	List<Todo> findByUsername(String username);
	

}
