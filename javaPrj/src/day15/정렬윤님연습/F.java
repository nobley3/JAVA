package day15.정렬윤님연습;

public class F implements YYCoffee{

	@Override
	public int Coffee2(Object c1, Object c2) {
		
		Coffee cc1=(Coffee)c1;
		Coffee cc2=(Coffee)c2;
		
		return cc1.getMl()-cc2.getMl();
	}

	

	}


