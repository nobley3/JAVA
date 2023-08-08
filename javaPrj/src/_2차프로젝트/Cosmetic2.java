package _2차프로젝트;

public class Cosmetic2 {

	String name;
	Product[] products;

	public Cosmetic2(String name, Product[] products) {
		this.name = name;
		this.products = products;
	}

	public void showMenu() {
		System.out.println(name + "의 상품 목록:");
		for (int i = 0; i < products.length; i++) {
			System.out.println((i + 1) + ". " + products[i].name +" "+"가격: "+products[i].discountedPrice+"￦");
		}
	}

////
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	

}
