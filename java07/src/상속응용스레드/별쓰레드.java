package ������뽺����;

public class �������� extends Thread {
	//�̹� ����, �޼��带 ����.
	//Thread Ŭ������ ������ �ִ� �޼��� �߿��� 
	//���ÿ� ó���ϰ� ���� ������ �־��ִ� run()�޼��尡 ����.
	@Override
	public void run() {
		//���ÿ� ó���ϰ� ���� ������  run�޼��� �ȿ��ٰ� �־��ּ���.!
		for (int i = 0; i < 5000; i++) {
			System.out.println("*");
		}
	}
	
}
