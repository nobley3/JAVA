package day9.함수;

import java.util.Scanner;

public class 실습문제3 {
	
	public static void main(String[] args) {
		//3.좋아하는거 5개를 관리할 수 있는 프로그램 작성하기 main에서 작성하기 ( 등록, 조회, 변경, 삭제)
		
		String[] gongcha =new String[5];
		Scanner sc = new Scanner(System.in);
		
		int menu;
		int index=0;
		
		loop: while(true) {
			System.out.println("메뉴선택: 1.등록 2.조회 3.변경 4.삭제");
			
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);
			
			switch(menu) {
			case 1:
				System.out.println("좋아하는 메뉴를 입력하세요");
				String name = sc.nextLine();
				gongcha[index]=name;
				index++;
				break;
			case 2:
				System.out.println("메뉴를 조회합니다");
				for(int i=0;i<index;i++) {
					System.out.println((i+1)+"."+gongcha[i]);
				}
				break;
			case 3:
				System.out.println("메뉴를 변경합니다");
				System.out.println("메뉴를 조회합니다");
				for(int i=0;i<index;i++) {
					System.out.println((i+1)+"."+gongcha[i]);
				}
				System.out.println("변경할 순번과 내용을 입력하세요");
				String updateIndex_ = sc.nextLine();
				int updateIndex=  Integer.parseInt(updateIndex_); //
				String updateMenu = sc.nextLine(); //한줄통째로 읽어온다.
				gongcha[updateIndex-1]=updateMenu;
				break;
			case 4:
				System.out.println("삭제");
				System.out.println("메뉴를 조회합니다");
				for(int i=0;i<index;i++) {
					System.out.println((i+1)+"."+gongcha[i]);
				}
				System.out.println("삭제하고 싶은 메뉴를 선택하세요");
				String deleteIndex_ = sc.nextLine();
				int deleteIndex = Integer.parseInt(deleteIndex_); //숫자로 바꿔주는 "25" ->25  
				gongcha[deleteIndex-1]="";
				break loop;
				
				default:
					System.out.println("잘못입력했습니다.");
					
			}
		}
				
	}

}
