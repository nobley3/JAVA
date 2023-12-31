package Project2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int menu;
		Cart2 c2 = new Cart2();
		OrderHandler oh = new OrderHandler();

		Scanner sc = new Scanner(System.in);

		System.out.println("상품 주문하기");

		loop: while (true) {
			System.out.println("메뉴 : 1.상품조회 , 2.상품담기, 3.수량변경, 4.삭제, 5.주문조회 6.주문하기");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("조회할 카테고리를 선택하세요");
				System.out.println("1. 색조, 2.기초 , 3.향수 , 4.기타");
				int choice = sc.nextInt();
				if (choice == 1) {
					c2.showMakeupItem();
				} else if (choice == 2) {
					c2.showSkinItemp();
				} else if (choice == 3) {
					c2.showPerfumeItem();
				} else {
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

				Goods goods = c2.searchItem(number);
				System.out.println(goods);

				Order order = new Order(count, goods);
				oh.addOrderItem(order);
				break;

			case 3:

				oh.showOrders();
				System.out.println("변경하실 상품번호를 입력하세요:");
				int changeNumber = sc.nextInt();

				if (changeNumber >= 1 && changeNumber <= oh.Olist.size()) {
					Order selectedOrder = oh.Olist.get(changeNumber - 1);
					System.out.println("현재 " + selectedOrder.getGoods().getName() + "의 수량: " + selectedOrder.getCount());
					System.out.println("새로운 수량을 입력하세요:");

					int newStock = sc.nextInt();
					selectedOrder.setCount(newStock);
					System.out.println(selectedOrder.getGoods().getName() + "의 수량이 " + newStock + "로 변경되었습니다.");
				} else {
					System.out.println("없는 번호입니다.");
				}
				break;
			case 4:
				oh.showOrders();
				System.out.println("삭제하실 상품번호를 입력하세요");
				Scanner sc3 = new Scanner(System.in);
				number = sc3.nextInt();
				Goods deletegoods=c2.searchItem(number);
				System.out.println("삭제하실 상품은 "+deletegoods+"입니다.");
				oh.removeOrders(number);
				break;

			case 5:
				oh.showOrders();

				break;

			case 6:

				break loop;
			default:
				System.out.println("잘못된 입력입니다.");

			}

		}
	}

}
