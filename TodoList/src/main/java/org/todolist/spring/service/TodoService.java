package org.todolist.spring.service;

import java.util.List;

import org.todolist.spring.model.Todo;

public interface TodoService {

	public List<Todo> listTodo();
	public void insertTodo(Todo todo);
	public void deleteTodo(Integer todoNo);
	
}
