package org.todolist.spring.dao;

import java.util.List;

import org.todolist.spring.model.Todo;

public interface TodoDao {

	public List<Todo> listTodo();

	public void insertTodo(Todo todo);

	public void deleteTodo(Integer todoNo);

}
