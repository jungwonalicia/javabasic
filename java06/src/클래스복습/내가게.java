package Ŭ��������;

public class ������ {

	public static void main(String[] args) {
		���� cal = new ����();	
		cal.���ϱ�(5000, 3000);
		//��ȯ���� ���� �޼���� ������� ������ ���� �� ����.
		//��ȯ���� ���� �޼���� ������� �޾Ƽ� ����Ʈ�� �� ����.
		cal.���ϱ�(30, 20, 10);
		//���ݾ��� ������� �ʿ�
		int result = cal.����(100000, 20000);
		System.out.println("��ȯ�� �� �ݾ� ������� " + result);
		
		if (result < 30000) {
			System.out.println("�ڵ� ���� �ؾ���.");
		} else {
			System.out.println("���� ���η� ��� ������.");
		}
		
		int result2 = cal.������(500, 20); 
		//500������ 20�� ����� 5�̻��̸�=> ���� ����� �� ����. 
		//					       �ƴϸ�=> �󸶾ȳ�����.
		if (result2 >= 5) {
			System.out.println("���� ����� �� ����.");
		} else {
			System.out.println("�� �ȳ�����.");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
