package Project2;


import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		int menu;
		Cart2 c2 =new Cart2();
		OrderHandler oh = new OrderHandler();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 주문하기");
		
		loop:while(true) {
			System.out.println("메뉴 : 1.상품조회 , 2.상품담기, 3.수량변경, 4.삭제,5.주문하기");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("조회할 카테고리를 선택하세요");
					System.out.println("1. 색조, 2.기초 , 3.향수 , 4.기타");
					int choice = sc.nextInt();
					if(choice==1) {
						c2.showMakeupItem();
					}else if(choice==2) {
						c2.showSkinItemp();
					}else if(choice==3) {
						c2.showPerfumeItem();
					}else {
						c2.showEtcItem();
					}
					break;
					
				case 2:
					 
					int number;
					int count;
					System.out.println("구매하실 상품번호와 수량을 입력하세요");
					Scanner sc2 = new Scanner(System.in);
					number = sc2.nextInt();
					count = sc2.nextInt();
					 
					 
					 //주문정보를 생성
					// 상품번호1 
					// 주문에 관련된 정보 , 수량, 배송지, 
				 
					 
					Goods goods=c2.searchItem( number);
					System.out.println( goods);
					
					 
				 
					//Order 클래스 정의
					//주문정보를 이용해서  Order객체생성
				   Order order = new Order(  count, goods );
				   oh.addOrderItem(order);
				   break;
				case 3:
					
				   oh.showOrders();
				   break;
					
					
}

}
}

	

	
}
