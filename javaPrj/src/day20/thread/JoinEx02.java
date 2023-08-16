package day20.thread;

public class JoinEx02 {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {//익명

			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					try {
						Thread.sleep(10);
						System.out.println((i+1)+"hi:)");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
					
			}});
		th.start();
		
		try {
			th.join(); //메인스레드에서 th스레드가 작업이 완료될 때 까지 기다린다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인종료");
	}

}

///////////////////////