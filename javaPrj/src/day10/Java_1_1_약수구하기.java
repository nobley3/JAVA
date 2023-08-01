package day10;



public class Java_1_1_약수구하기 {

	public static int[] getYak(int num) {
		
        int[] yak = new int[20];
        int j = 0; // 배열시작 0...19
        for (int i = 1; i <= num; i++) {   //   i:  12  => 12/1  ~12/12   
            if (num % i == 0){//약수 구하는식 
                yak[j] = i; // i 가 배열에 들어가게함
                j++;	
            }
        }
        
        return yak;
        
        
    }
}