package telran.multithreading;

public class Worker extends Thread {
	static final Object mon1 = new Object();
	static final Object mon2 = new Object();
public void run() {
	for(int i = 0; i < 10; i++) {
		m1();
		m2();
	}
}
private void m2() {
	synchronized (mon2) {
		try {
			sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (mon1) {
			//code
		}
	}
	
}
private void m1() {
	synchronized (mon1) {
		synchronized (mon2) {
			
		}
	}
	
}
}