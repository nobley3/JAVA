package day20.thread;

public class SleepEx {

	public static void main(String[] args) {

		SThread th1 = new SThread();
		th1.start();
		
		SThread2 th2 = new SThread2();
		th2.start();
		
	}

}
///////////////////////////////
// 작성하는 파일명과 퍼블릭 클래스 이름이 같아야함
class SThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println((i+1)+"hi:)");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
/////////////////////////////////
class SThread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			try {
				sleep(200); // 0.2초 지연하는..
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println((i+1)+"bye:(");
			
		}
	}
}