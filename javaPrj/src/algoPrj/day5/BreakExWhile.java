package algoPrj.day5;

import java.util.Scanner;

public class BreakExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu;
		Scanner sc = new Scanner(System.in);
		
		 //반복문 사용하기
		loop:while(true) {
			System.out.print("메뉴 1.등록, 2조회, 3.변경, 4.삭제 5.종료");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					System.out.println("등록선택");
					break;
				case 2:
					System.out.println("조회선택");
					break;
				case 3:
					System.out.println("변경선택");
					break;
				case 4:
					System.out.println("삭제선택");
					break;
				case 5:
					System.out.println("종료");
					break loop;
				default:
					System.out.println("잘못된 선택");
			}
		}
	}

}
