package org.todolist.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.todolist.spring.model.Todo;
import org.todolist.spring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String listTodo(ModelMap model) {
		model.addAttribute("todoList", todoService.listTodo());
		return "todo";
	} 
	
	@RequestMapping(value = "/addtodo", method = RequestMethod.GET)
	public ModelAndView addTodo(ModelMap model) {
		return new ModelAndView("addtodo", "command", new Todo());
	}

	@RequestMapping(value = "/updatetodo", method = RequestMethod.POST)
	public String updateTodo(@ModelAttribute("todoForm") Todo todo, ModelMap model) {
		this.todoService.insertTodo(todo);
		model.addAttribute("todoList", todoService.listTodo());
		return "todo";
	}

	@RequestMapping(value = "/delete/{empId}", method = RequestMethod.GET)
	public String deleteTodo(@PathVariable("empId") Integer empId, ModelMap model) {
		this.todoService.deleteTodo(empId);
		model.addAttribute("todoList", todoService.listTodo());
		return "todo";
	}
}
