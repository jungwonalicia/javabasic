package ����ó��;

public class �����߻� {

	public static void main(String[] args) {
		System.out.println("1. ���α׷��� ���۵˴ϴ�.");
		
		try {
			//������ �߻��� ���� ���� �ڵ�
			System.out.println("2. ���α׷� ���� " + 3/0);
		} catch (Exception e) {
			//������ �߻����� �� ó�� �ڵ�
			e.printStackTrace(); //�������� ���
			System.out.println("0���� ����� �̺κ��� ������ ���� ����.");
		}
		//������ �߻��ϸ�, ������ �߻��� ���Ĵ� ������ ���� ����.
		//������ �߻��ϴ����, �� ������ �߻��� �κи� ���࿡�� ���ܽ�Ű�� ó���� �ϰԵǸ�
		//��� �̾ �����ϰ� �� �� �ִ�.
		System.out.println("3. ���� ������ ���� �ɱ��??");
	}
}
