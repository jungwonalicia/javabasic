package Ŭ���������;

public class �޴��� {
	//����: ��, ��Ż�=> �������
	//���� ����!
	public String color;
	public String company;
	
	//����: ī���ϴ�, ���ͳ��ϴ�=> ����޼���(����Լ�)
	//������ �����Ѵ�.(�޼��带 �����Ѵ�.)
	public void ī���ϴ�() {
		System.out.println("��ü���� ����.");
		System.out.println("���������� ����.");
	}
	public void ���ͳ��ϴ�() {
		System.out.println("ī�信 �α����ϴ�.");
		System.out.println("ī�信 ���� �ø���.");
	}
	
	@Override
	public String toString() {
		return "�޴��� [color=" + color + ", company=" + company + "]";
	}
	
	
}
