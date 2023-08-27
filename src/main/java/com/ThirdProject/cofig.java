package com.ThirdProject;

public class cofig {
	private String name;
	private String desc;
	private int id;
	public cofig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public cofig(String name, String desc, int id) {
		super();
		this.name = name;
		this.desc = desc;
		this.id = id;
	}

public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}