package ������뽺����;

public class ���Ҿ����� extends Thread {
	@Override
	public void run() {
		for (int i = 5000; i >= 0; i--) {
			System.out.println("����>> " + i);
		}
	}
	
}
