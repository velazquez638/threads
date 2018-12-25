package lastStore;

public class Books_dates {

	public String categorie;
	public String name;
	public String author;
	public float price;
	
	public Books_dates(String categorie, String name, String author, float price) {
		
		this.categorie = categorie;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
