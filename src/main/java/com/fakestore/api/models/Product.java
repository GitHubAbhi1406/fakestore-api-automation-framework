package com.fakestore.api.models;

public class Product{
	
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	
	
	public Product() {
		
	}
	
	public Product(String title, double price, String description, String category, String image) {
		
		this.title = title;
		this.price = price;
		this.description = description;
		this.category = category;
		this.image = image;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImage() {
		return image;
	}
}