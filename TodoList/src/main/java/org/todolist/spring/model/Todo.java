package org.todolist.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TODO")
public class Todo {
	@Id
	@Column(name = "NO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DUE")
	private String due;

	@Column(name = "DETAIL")
	private String detail;

	@Column(name = "REGISTER")
	private String register;

	@Column(name = "CATEGORY")
	private int category;
	
	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDue() {
		return due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	@Override
	public String toString() {
		
		return "ToDo [no=" + no + ", title=" + title + ", detail="
				+ detail + ", register=" + register + ", category=" + category;
	}
	
	


}
