package _2차프로젝트;

import java.util.ArrayList;

public class CartTest2 {

	public static void main(String[] args) {

		ArrayList<Goods> list = new ArrayList<>();
		
		String category ="베이스메이크업";
		String name = "에스쁘아 프로테일러 파운데이션 비벨벳";
		int pprice = 34000;
		Goods g = new Goods(category,name,pprice);
		
		list.add(g);
		System.out.println();
		
		
		
		
	}

}
