package ecom.products.model;

public class Product {
	
	private int id;
	private String title;
	private String image;
	private String category;
	private int price;
	private float ratings;
	private String description;
	
	
	
	public Product(int id,String title,String image, String category, int price, float ratings,String description) {
		super();
		
		this.setId(id);
		this.title=title;
		this.image=image;
		this.category=category;
		this.price=price;
		this.ratings=ratings;
		this.description=description;
	}
	
	
	public Product() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
