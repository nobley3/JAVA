package day17;

import java.util.ArrayList;

public class CustomerHandler {
	
	ArrayList<Customer> list = new ArrayList<>();
	
	void run() {
		// 실행코드
		System.out.println("hi");
		register();
		register();
		
		search();
		
	}

	public void search() {
		 
		System.out.println(" 회원을 조회합니다");
		
		for( int i=0 ; i< list.size() ;i++) {			
			Customer  customer=list.get(i);
			System.out.println( customer);
		}
	}

	public void register() {
		//회원을 등록합니다
		System.out.println(" 회원을 등록합니다");
		String name="윤정";
		String phone="010-111-222";
		String address="서울시";		
		Customer c = new Customer( name, phone, address);
		list.add(c);
	}

	public static void main(String[] args) {	 
		CustomerHandler m  = new CustomerHandler();
		m.run();

	}

}
