package _2차프로젝트;

public class Order {

	int GoodsNum;
	String category;
	String name;
	int price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int goodsNum, String category, String name, int price) {
		super();
		GoodsNum = goodsNum;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [GoodsNum=" + GoodsNum + ", category=" + category + ", name=" + name + ", price=" + price + "]";
	}

	public int getGoodsNum() {
		return GoodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		GoodsNum = goodsNum;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
