package com.cgi.appdev.bean;

public class ContactBean
{

	private String name;
	private int number;
	private String group;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "ContactBean [name=" + name + ", number=" + number + ", group=" + group + "]";
	}


}
