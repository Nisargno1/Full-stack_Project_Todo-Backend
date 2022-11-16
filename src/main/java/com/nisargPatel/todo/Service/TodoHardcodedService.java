package com.nisargPatel.todo.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.nisargPatel.todo.Model.Todo;
import com.nisargPatel.todo.repository.TodoRepository;

@Service
public class TodoHardcodedService{
	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter = 1;

	static {
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the AngularNg", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Rest API", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
		todos.add(new Todo(idCounter++, "Nisarg", "Learn the Springboot", new Date(), false));
	}

	public List<Todo> findAll() {

		return todos;
	}
	//find todo by id
	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	// Delete Todo
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if (todo == null) {
			return null;
		}
		if (todos.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(idCounter++);
			todos.add(todo);
		}
		else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	
	
}
