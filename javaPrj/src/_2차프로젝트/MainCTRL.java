package _2차프로젝트;
import java.util.Scanner;
public class MainCTRL {

	public static void main(String[] args) {

		Membership_Mng mm = new Membership_Mng();
		mm.init();
	
		Customer_Mng cm = new Customer_Mng();
		cm.init(mm);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 고객");
			System.out.println("2. 관리자");
			int num = sc.nextInt();
			loop: switch(num) {
			case 1:
				 while(true){
					System.out.println("1. 로그인");
					System.out.println("2. 회원가입");
					System.out.println("3. 상품 조회");
					System.out.println("4. 장바구니");
					System.out.println("5. 구매");
					System.out.println("6. 뒤로가기");
					int cnum = sc.nextInt();
					switch(cnum) {
					case 1: 
						System.out.println("로그인");
						break;
					case 2:
						cm.inputData(mm); 
						break;
					case 3:
						System.out.println("상품조회");
						break;
					case 4:
						System.out.println("장바구니");
						break;
					case 5:
						System.out.println("구매");
						break;
					case 6:
						break loop;
					}
				}
			case 2:
				while(true){
					System.out.println("1. 고객 조회");
					System.out.println("2. 등급 정보 조회");
					System.out.println("3. 상품 조회");
					System.out.println("4. 상품 수정");
					System.out.println("5. 뒤로가기");
					int cnum = sc.nextInt();
					switch(cnum) {
					case 1: 
						cm.printData();
						break;
					case 2:
						mm.printData(); // 정렬로 다시 수정하삼
						break;
					case 3:
						System.out.println("상품 조회");
						break;
					case 4:
						System.out.println("상품 수정");
						break;
					case 5:
						break loop;
					}
				}
			}
		}
	}

}
