package Ŭ���������;

//������ class�� ������ Ʋ����!!
//�������� �ʿ��ϸ� class�� �̿��ؼ� ���� ���� ��.
//public:���������� �� �ϳ�, �ƹ���Ű������ ���� ����
//x(�Ƚ���): ���������� �� �ϳ�, ������Ű�������� ���� ����
public class ������ {
	//�������� ������ Ư������ "Ʋ"�� ������ �Ѵ�.
	//����: ��, �̸� => ����
	public String color;
	public String name;
	
	//����: ¢��, ���ڴ�. => �Լ�(���ó��)-> �޼���
	public void ¢��() {
		System.out.println("�������� �п� ¢��.");
	}
	public void ���ڴ�() {
		System.out.println("�������� ���� ���� ���ڴ�.");
	}
	
	@Override
	public String toString() {
		return "������ [color=" + color + ", name=" + name + "]";
	}
	
	
}
