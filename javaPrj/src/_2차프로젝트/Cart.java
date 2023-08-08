package _2차프로젝트;

public class Cart {

	
	Goods goods;
	int count;
	 int sum;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public Cart(Goods goods, int count) {
		super();
		this.goods = goods;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Cart [goods=" + goods + ", count=" + count + ", sum=" + sum + "]";
	}
	 
	 
}
