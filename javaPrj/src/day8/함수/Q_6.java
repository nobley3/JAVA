package day8.함수;

public class Q_6 {

	public static void main(String[] args) {
		// 일주일간의 날씨정보를 반환하는 함수 만들기 ( 날씨정보는 임의 작성)
		
		String[] WW = weather();
		
			for(int i=0;i<WW.length;i++) {
				System.out.println(WW[i]);
			}
		}

	public static String[] weather() {
		
		String[] WW = {"월요일:흐림","화요일:맑음","수요일:강우","목요일:맑음","금요일:맑은뒤흐림","토요일:폭염주의","일요일:비"};
		return WW;
	}
}


