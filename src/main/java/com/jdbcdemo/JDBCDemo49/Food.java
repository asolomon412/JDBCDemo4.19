package com.jdbcdemo.JDBCDemo49;

// a simple class with getters and setters
// 1. a Java Bean
// 2. a POJO (plain old java object)
// 3. a DTO (data transfer object) - based off the DAO design pattern
public class Food {
	private String name;
	private String category;
	private String description;
	private int id;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String name, String category, String description, int id) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", category=" + category + ", description=" + description + ", id=" + id + "]";
	}

}
