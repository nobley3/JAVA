package day6;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//내가좋아하는 과일5
		//내가좋아하는 음료5
		
		String[]fruits= {"수박","딸기","망고","자몽","복숭아"};
		String[]beverage= {"블랙밀크티","자몽그린티","망고요구르트","타로밀크티","우롱밀크티"};
		
		
		//2차원 배열
		
		//2차원 배열 선언 [행][열]
		//String[][]favorites = new String[2][5];
		String[][]favorites = {{"수박","딸기","망고","자몽","복숭아"},
				{"블랙밀크티","자몽그린티","망고요구르트","타로밀크티","우롱밀크티"}};
		
		System.out.println(favorites[0][0]); //수박
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println(favorites[0][4]);
		
		System.out.println(favorites[1][0]);//블랙밀크티
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		System.out.println(favorites[1][4]);
	
	}

}
