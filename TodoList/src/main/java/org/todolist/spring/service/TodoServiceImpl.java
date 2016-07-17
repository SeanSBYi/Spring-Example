package org.todolist.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todolist.spring.dao.TodoDao;
import org.todolist.spring.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDao todoDao;
	
	public List<Todo> listTodo() {
		return this.todoDao.listTodo();
	}

	public void insertTodo(Todo todo) {
		this.todoDao.insertTodo(todo);
	}

	public void deleteTodo(Integer todoNo) {
		this.todoDao.deleteTodo(todoNo);
	}

}
