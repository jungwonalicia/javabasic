package ����ó��;

public class �����߻�2 {
	public void call() {
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� ����ó����.");
		}
	}
}
