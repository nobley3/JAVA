package day20.thread;

public class 데몬스레드Ex {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

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
		th.setDaemon(true); // main이 끝나면 같이 끝나버리는 것 ex)자동저장기능
		th.start();
		
		System.out.println("메인종료");
	
	}

}
