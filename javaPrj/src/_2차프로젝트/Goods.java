package _2차프로젝트;

public class Goods {

	
	 String category;
	 String name;
	 int price;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(String category, String name, int price) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [category=" + category + ", name=" + name + ", price=" + price + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}
	
	
}
