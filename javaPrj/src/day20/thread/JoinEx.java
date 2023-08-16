package day20.thread;

public class JoinEx {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {//익명

			@Override
			public void run() {
				for(int i=0;i<100;i++)
					System.out.println((i+1)+"hi:)");
				
			}});
		th.start();
		
		System.out.println("메인종료");
	}

}

///////////////////////
