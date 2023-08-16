package day20.thread;

public class Thread연습2 {

	public static void main(String[] args) {

		G g1 = new G();
		g1.start();
		
		G2 g2 = new G2();
		g2.start();
	
	}

	
}

class G extends Thread{
	@Override
	public void run() {
		C c = new C();
		c.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("공격하기");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class G2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("방어하기");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class C extends Thread{
	@Override
	public void run() {
		
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}