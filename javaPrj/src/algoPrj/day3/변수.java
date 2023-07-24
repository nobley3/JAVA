package algoPrj.day3;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 : 메모리블럭, 기억장소(공간),기억장소를 식별하기 위한 이름
		// 변수선언
		//자료형 변수이름
		 int a; //4 byte 기억공간  기억장소를 확보함,정수형으로 해석
		 
		 //자료형
		 //크기+해석방법
		 //자료형(공간의 크기와 공간의 내용을 해석하는 방법)
		 /*
		  *  int : 정수형, 4byte  예시) int a; (+ = 약 21억)
		  *  byte: 1byte(8bit,1bit sign -128~+127)
		  *  shot: 2byte(16bit) -31768~32767
		  *  int 4byte (32bit)
		  *  long :8byte(64bit)
		  *  
		  *  char : 문자형 : 문자하나를 저장할 수 있는 공간, 2byte
		  *  예시)char ch='a'; // 한 문자는 '' 홑따움표 표현;
		  *  예시)char ch2='한'; 
		  *  
		  *  double : 실수형 데이터를 저장할 수 있는 공간 : 8byte
		  *  		  15자리까지 표현
		  *  float : 4byte : 소수이하 7자리까지 표현
		  *  예시) double avg=98.77;
		  *  boolean : 논리형 true(0이 아닌값), false(0인값)
		  *  예시)boolean flag=true;
		  */
		 //리터럴 : 값자체, ex)10,10.3,'a',"hello" ...
		 //상수영역에 저장된다.
		 //저장이 된다 = 크기를 가진다.
		 //정수형 리터럴(값) int형으로 저장된다.
		 //실수형 리터럴(값) double형으로 저장된다.
		 
		 int iNum=334; //334란 값이 상수영역에 저장되는 것 ok
		 			   // iNum 이라는 기억장소에 저장되는 것 ok
		 
		 //long iLong=2200000000;
		 				// 22억이라는 값을 상수영역에 저장하는 것에 문제 발생
		 long iLong=2200000000L;
		 
		 				//long형 리터럴값을 표현해야 함 숫자L로 long형 리터럴 표현함.
		 double d = 23.3; // 23.3실수형 리터럴이 double형으로 상수영역에 저장된다
		 				  //d라는 변수에 저장됨
		 
		 //float f = 23.3; // 23.3 상수영역에 저장되는 것 ok
		 				 //	double형이 float변수에 저장될 때 문제발생 됨 x
		 float f = 23.3f; //상수영역에 float형 값으로 저장될 수 있도록 표현해야함.
		 				  //숫자f 표시해야 float형 상수로 저장됨
		 
		 char ch='a'; // 한 문자를 저장하기 위한 공간을 확보할 때 사용하는 자료형
		 			  // '' 한 문자를 표현한다.
		 			  // 2byte 사용함
		 char ch2='김';
		 System.out.println(ch);
		 System.out.println(ch2);
		 
		 //"문자열 어떻게 표현할까요?"
		 // 문자열은 문자 여러개가 모인것 입니다. 문자집합이라고 표현한다.
		 
		 //"I like java" //문자11개를 저장할 수 있는 공간 필요=>문자배열로 표현함
		 //
		 char[]str={'i',' ','l','i','k','e',' ','j','a','v','a'};
		 char[]str2=new char[11];
		 
		 str2[0]='i';
		 str2[1]=' ';
		 str2[2]='l';
		 str2[3]='i';
		 str2[4]='k';
		 str2[5]='e';
		 str2[6]=' ';
		 str2[7]='j';
		 str2[8]='a';
		 str2[9]='v';
		 str2[10]='a';
		 
		 System.out.println("문자열출력");
		 System.out.print(str2[0]);
		 System.out.print(str2[1]);
		 System.out.print(str2[2]);
		 System.out.print(str2[3]);
		 System.out.print(str2[4]);
		 System.out.print(str2[5]);
		 System.out.print(str2[6]);
		 System.out.print(str2[7]);
		 System.out.print(str2[8]);
		 System.out.print(str2[9]);
		 System.out.print(str2[10]);
		 
		 String str3="I like java";
		 System.out.println(str3);
		 
		char result = str3.charAt(2);
		System.out.println(result);
		
		//논리값을 저장할 수 있는 자료형 true,false
		boolean flag=true; 
		
		//1.
		/*if(flag==true) {
			System.out.println("조건이 참입니다.");
		}*/
		//2. 보통 많이 쓰이는 방법
		if(flag) {
			System.out.println("조건이 참입니다.");
		}else {
			System.out.println("조건이 거짓입니다.");
		}
	}
	
	
}
