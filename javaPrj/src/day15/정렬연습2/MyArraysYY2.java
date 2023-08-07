package day15.정렬연습2;

public class MyArraysYY2 {

	public static void sort(Object[]obj,MyComparatorYY2 c ) {
		
		for(int i=0;i<obj.length-1;i++) {
			for(int j=i+1;j<obj.length;j++) {
				if(c.compare(obj[i], obj[j])>0) {
					
					Object tmp;
					tmp = obj[i];
					obj[i]=obj[j];
					obj[j]=tmp;
				}
			}
		}
	}
}
