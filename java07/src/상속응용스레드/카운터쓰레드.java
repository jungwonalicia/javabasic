package ������뽺����;

public class ī���;����� extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("ī���� : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("CPU��û �� �����߻�!!");
			}//0.5�ʸ��� ������.!
		}
	}
	
}
