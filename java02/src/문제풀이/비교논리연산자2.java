package ����Ǯ��;

public class �񱳳�������2 {

	public static void main(String[] args) {
		//ȸ�����Խ� ������ id/pw
		int id = 1111;
		int pw = 2222;
		
		//�α����� �� �Է��� id/pw
		int id2 = 1111;
		int pw2 = 2000;
		//��������: &&(and), ||(or), !(not)
		if (pw == pw2 && id == id2) {
			//&&�� ���, false�� ���ɼ��� ���� ���� �� �� �������� ���� ����.
			//||�� ���, true�� ���ɼ��� ���� ���� �� �� �������� ���� ����.
			System.out.println("�α��� ����!");
			System.out.println("�����մϴ�.!!");
		} else {
			System.out.println("�α��� ����@@");
		}
		
		

	}

}
