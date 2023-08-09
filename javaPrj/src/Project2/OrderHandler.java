package Project2;

import java.util.ArrayList;

public class OrderHandler {

	ArrayList <Order> Olist = new ArrayList<>(); 

	//주문정보 등록
	public void addOrderItem(Order order ) {
		
	 	Olist.add(order);
	}
	
//	주문정보 조회
	public void showOrders() {
		
		for(Order o : Olist) {
			System.out.println(o);
		}
	}
	 
//	주문삭제
	public void removeOrders(int num ) {
		
		System.out.println(num+"번째 상품을 삭제하겠습니다.");
		Olist.remove(num-1);
		 
	}
//	수량변경
	public void changeOrders(int count) {
		
	}
}
