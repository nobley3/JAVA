package day20.thread;

public class Ex02 {

	public static void main(String[] args) {

		R r = new R();
		Thread t = new Thread(r);
//		Thread t = new Thread(new R());
		t.start();//thread 실행요청
		for(int i=0;i<100;i++)
			System.out.println((i+1)+"hi:)");
	}

}

class R implements Runnable{ // 인터페이스를 구현할 클래스

	@Override
	public void run() {
		for(int i=0;i<100;i++)
			System.out.println((i+1)+"bye:(");
	}
	
}