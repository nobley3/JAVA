package _2차프로젝트;


import java.util.ArrayList;
import java.util.Scanner;

public class admin2 {

	public static void main(String[] args) {
		
		
		ArrayList<Product> cartList = new ArrayList<>();
		
		
		Product[][] makeup = {
				// 기초화장품
				{ new Product("에스쁘아 프로테일러 파운데이션 비벨벳", 40000, 34000, 10),
						new Product("파넬 시카마누 세럼쿠션 (2종 중 택1)", 32000, 29800, 20),
						new Product("클리오 킬커버 파운웨어 파운데이션", 34000, 23800, 30),
						new Product("네이밍 레이어드 핏 쿠션 12g", 28000, 22400, 40) },
				// 포인트
				{ new Product("롬앤쥬시래스팅틴트", 9900, 8400, 10), new Product("베네피트 프리사이슬리 마이브로우펜슬", 40000, 34000, 10),
						new Product("힌스뉴뎁스아이섀도우", 18000, 14400, 10), new Product("홀리카홀리카 젤리도우블러셔", 9500, 6500, 50) } };

		Product[][] perfume = {

				{ new Product("클린 웜코튼", 93000, 58590, 20), new Product("포맨트 시그니처 퍼퓸", 39000, 37000, 32),
						new Product("랑방에끌라드 아르페쥬", 64000, 44800, 10), new Product("안나수이 스카이", 93000, 46500, 43) } };

		Product[][] skincare = {
				// 선크림
				{ new Product("AHC 마스터즈 에어리치 선스틱 22g", 21000, 14060, 30),
						new Product("식물나라 산소수 워터프루프 선스프레이 SPF50+PA++++1+1 기획", 14800, 13900, 10),
						new Product("닥터지 그린 마일드 업 선플러스 50ml 1+1 기획세트", 29000, 26100, 10),
						new Product("라운드랩 자작나무 무기자차 선크림 50ml 1+1 기획", 25000, 25000, 30) },
				// 토너
				{ new Product("아누아 어성초 77 수딩 토너 350ML 리필 기획세트", 49000, 31900, 12),
						new Product("토리든 다이브인 저분자 히알루론산 토너 500ml 기획", 29000, 19800, 15),
						new Product("라운드랩 1025 독도 토너 500ml+200ml 기획", 45000, 29800, 123),
						new Product("브링그린 티트리시카수딩토너 대용량증정기획", 27000, 20520, 12) } };

		Product[][] Items = {
				// 기타용품
				{ new Product("닥터아토 손소독티슈 20매", 1600, 1600, 120), new Product("필리밀리 듀얼 라운드 화장솜 60P", 3300, 3300, 12),
						new Product("디어달리아 블루밍에디션 프로페탈 브러쉬", 19000, 19000, 30),
						new Product("메디힐 비타 에센셜 마스크 10매입", 10000, 10000, 12) } };
		Cosmetic2[] menu = { new Cosmetic2("색조화장품 - 베이스", makeup[0]), new Cosmetic2("색조화장품 - 포인트", makeup[1]),
				new Cosmetic2("향수", perfume[0]), new Cosmetic2("기초화장품 - 선케어", skincare[0]),
				new Cosmetic2("기초화장품 - 스킨로션", skincare[1]), new Cosmetic2("기타용품", Items[0]) };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("----- 원하는 파트를 고르세요 -----");
			for (int i = 0; i < menu.length; i++) {
				System.out.println((i + 1) + ". " + menu[i].name);
			}
			System.out.println("0. 종료");

			int choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (choice >= 1) {
				int categoryIndex = choice - 1;
				Cosmetic2 selectCategory = menu[categoryIndex];
				selectCategory.showMenu();

				System.out.println(" ");
				System.out.println("1. 상품선택");
				System.out.println("2. 상품삭제");
				
				
				
						
				
				
			
				

				
			
				
			}
		}
	}
}