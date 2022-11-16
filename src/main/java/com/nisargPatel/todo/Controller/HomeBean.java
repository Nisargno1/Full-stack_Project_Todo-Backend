package com.nisargPatel.todo.Controller;

public class HomeBean {
	private String name;

	public HomeBean(String name) {
		super();
		this.name = name;
	}

	public HomeBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HomeBean [name=" + name + "]";
	}
	
}
