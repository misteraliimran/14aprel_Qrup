package lesson2;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		for (char c = 'A'; c <= 'E'; c++) {
			System.out.println("MyThread2: " + c);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}