package �迭��ȭ;

public class �����Ǻ���⺻�� {

	public static void main(String[] args) {
		//�⺻�� ���� ����
		//����! Ÿ�� ������; => RAM�� ������ �Ҵ�
		int x = 100;
		int y = x; //�⺻���� ����
		System.out.println("������ x: " + x);
		System.out.println("������ y: " + y);
		
		x = 99; //������
		System.out.println("������ x: " + x);
		System.out.println("������ y: " + y);
	}

}
