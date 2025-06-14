package com.empower.ecom.dto;

public class ProductDTO {
	
	private Long id;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private String category;
    private boolean featured;
    
    public ProductDTO(Long id, String title, String description, Double price, 
            String imageUrl, String category, boolean featured) {
this.id = id;
this.title = title;
this.description = description;
this.price = price;
this.imageUrl = imageUrl;
this.category = category;
this.featured = featured;
}
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	
    
    // Constructors, getters, setters
}
