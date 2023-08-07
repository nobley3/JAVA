package day15.정렬윤님연습;

public class CoffeeArraysYY {

	public static void sort(Object[] obj,YYCoffee c) {
		
		
		for(int i=0;i<obj.length-1;i++) {
			for(int j=i+1;j<obj.length;j++) {
				if(c.Coffee2(obj[i], obj[j])>0) {
					
					Object tmp;
					tmp=obj[i];
					obj[i]=obj[j];
					obj[j]=tmp;
				}
			}
		}
	}
}
