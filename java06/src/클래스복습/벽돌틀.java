package Ŭ��������;

public class ����Ʋ {
	//�������, ����
	//��������(�۷ι�����), �ڵ��ʱ�ȭ������.
	int x = 0;
	int y = 0;
	String color = null; //�������� null�� �ʱ�ȭ
	
	//�Է°��� ���� Ŭ�����̸��� ������ �޼��尡 �ڵ������� �ȴ�.
	//new ����Ʋ()������, �� �޼��尡 �ڵ� �����̵ȴ�.!
	//��ü ������, �� �������־�� �κ��� ���⿡ ������ �� �����Ű�� ����.
	//new�� ������ ��ü������ �ڵ����� �������ִ� �޼���
	//������ �޼���(������, constructor)
	public ����Ʋ() {
		System.out.println("������ �������.");
	}
	
	public ����Ʋ(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}


	//����޼���, ����
	public void �״�() {
		int move = 50; //��������(���ú���), �ڵ��ʱ�ȭx
		System.out.println(move + "��ŭ ������ �״�.");
	}

	@Override
	public String toString() {
		return "����Ʋ [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
}
