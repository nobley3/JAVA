package day9.함수;

public class 실습문제8_order {

	public static void main(String[] args) {
		/*
		주문번호: 201803120001
		주문자아이디: abc123
		주문날짜:2018년3월12일
		주문자이름: 홍길순
		주문상품번호😛D0345-12
		배송주소: 서울시 영등포구 여의도동 20번지
		*/
		실습문제8_클래스문제2 Q2 = new 실습문제8_클래스문제2();
		
		Q2.number = 201803120001L; // long 쓸때 뒤에 L 붙이기
		Q2.id="abc123";
		Q2.day="2018년3월12일";
		Q2.name="홍길순";
		Q2.ordernum="D0345-12";
		Q2.adrs="서울시 영등포구 여의도동 20번지";
		
		
		System.out.println("주문번호: "+Q2.number);
		System.out.println("id: "+Q2.id);
		System.out.println("주문날짜: "+Q2.day);
		System.out.println("주문자: "+Q2.name);
		System.out.println("주문번호: "+Q2.ordernum);
		System.out.println("배송지: "+Q2.adrs);
		
	}

}
