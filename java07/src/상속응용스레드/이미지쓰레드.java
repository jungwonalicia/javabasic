package ������뽺����;

public class �̹��������� extends Thread {

	@Override
	public void run() {
		String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < 5; i++) {
			System.out.println("�̹���>>  " + img[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("CPU��û �� �����߻�!!");
			}//5�ʸ��� ������.!
		}
	}
	
}
