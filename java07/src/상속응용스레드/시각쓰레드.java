package ������뽺����;

import java.util.Date;

public class �ð������� extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println("����ð�: " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("CPU��û �� �����߻�!!");
			}//1�ʸ��� ������.!
		}
	}
	
}
