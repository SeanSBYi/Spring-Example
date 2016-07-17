package org.todolist.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.todolist.spring.model.Todo;

@Repository
public class TodoDaoImpl implements TodoDao {

	private static final Logger logger = LoggerFactory.getLogger(TodoDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Todo> listTodo() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Todo";
		Query query = session.createQuery(hql);
		List<Todo> todoList = query.list();
		logger.info("Todo List::" + todoList);
		return todoList;
	}

	public void insertTodo(Todo todo) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(todo);
		session.getTransaction().commit();

	}

	public void deleteTodo(Integer todoNo) {
		System.out.println("hql Using Delete");
		Session session = sessionFactory.openSession();
		String hql = "DELETE FROM todo T WHERE T.id = :todo_no";
		Query query = session.createQuery(hql);
		query.setParameter("todo_no:", todoNo);
		int result = query.executeUpdate();
		System.out.println("Row affected: " + result);

	}

}
