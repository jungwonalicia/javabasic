package ������;

public class �ڵ���Ʋ {
	String color;
	String company;
	
	//�Ķ���� �ִ� ������
	public �ڵ���Ʋ(String color, String company) {
		this.color = color;
		this.company = company;
	}
	
	public void speedUp() {
		System.out.println("�ڵ��� �ӵ��� Up��Ű��.!!");
	}

	@Override
	public String toString() {
		return "�ڵ���Ʋ [color=" + color + ", company=" + company + "]";
	}
	
	
}
