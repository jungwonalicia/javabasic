package Ŭ��������;

public class ���� {
	//���⸦ ������ �� �� �ִ� ������ �޼���� �����.
	//����޼���
	//public: �ƹ������� ���� ����
	//void: ������ ����.
	//���ϱ�: �޼��� �̸�(�����̸�)
	//(int x, int y): ������ ó���ϱ� ���� �Է°�
	public void ���ϱ�(int x, int y) {
		//���ϱ� �޼��� �ȿ��� ������� x,y��
		//���ϱ� �޼��� �����ȿ����� ��� ����
		//��������
		//x, y�� �Ű�����, �Ķ����
		System.out.println("���ϱ� ��� ó�� ����");
		System.out.println(x + y);
	}
	public int ����(int x, int y) {
		System.out.println("���� ��� ó�� ����");
		int result = x - y;
		System.out.println("�� ������� " + result + "��");
		return result;
	}
	public void ���ϱ�(int x, int y, int z) {
		System.out.println("���ϱ� ��� ó�� ����");
		System.out.println(x * y * z);
	}
	public int ������(int x, int y) {
		System.out.println("������ ��� ó�� ����");
		return x / y;
	}
}




















