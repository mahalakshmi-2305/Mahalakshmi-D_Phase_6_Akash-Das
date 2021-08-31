package com.healthcare.app.dto;


public class ProductDTO {
	private long id;
	private String name;
	private int categoryId;
	private double price;
	private String seller;
	private String description;
	private String imageName;
	
	public ProductDTO() {
		
	}

	

	public ProductDTO(long id, String name, int categoryId, double price, String seller, String description,
			String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.price = price;
		this.seller = seller;
		this.description = description;
		this.imageName = imageName;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", category=" + categoryId + ", price=" + price + ", seller="
				+ seller + ", description=" + description + ", imageName=" + imageName + "]";
	}
	
	

}
