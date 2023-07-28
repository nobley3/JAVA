package day9.class자료형;

public class melon {

	public static void main(String[] args) {
		
		Classtest m1 = new Classtest();
		
		m1.name="NewJeans";
		m1.title="Super Shy";
		m1.ranking=1;
		
		Classtest m2 = new Classtest();
		m2.name="정국";
		m2.title="Seven (feat. Latto) - Clean Ver.";
		m2.ranking=2;
		
		Classtest m3 = new Classtest();
		
		m3.name="NewJeans";
		m3.title="ETA";
		m3.ranking=3;
		
		Classtest m4 = new Classtest();
		
		m4.name="(여자)아이들";
		m4.title="퀸카 (Queencard)";
		m4.ranking=4;
		
		System.out.println(m1.name);
		System.out.println(m1.title);
		System.out.println(m1.ranking+"위"+"\n");
		
		System.out.println(m2.name);
		System.out.println(m2.title);
		System.out.println(m2.ranking+"위"+"\n");
		
		System.out.println(m3.name);
		System.out.println(m3.title);
		System.out.println(m3.ranking+"위"+"\n");
		
		System.out.println(m4.name);
		System.out.println(m4.title);
		System.out.println(m4.ranking+"위"+"\n");
		
	}

}
