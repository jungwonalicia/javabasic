package Ŭ���������;

public class TV {
	//������ ����=> Ÿ�� ������;
	//������ ��ġ=> ������ ����(���)�� �� �ִ� ����
	//������ => ��������(Ŭ���� �� ��ü�������� ��� ����)
	//         global����, �۷ι� ����
	//�۷ι������� �ڵ��ʱ�ȭ�� ���ش�.
	//new�Ҷ� ���簡 �Ǵ� �� ���������� "�ν��Ͻ�����"
	//�ν��Ͻ���� ���� �������̶�� �ǹ�
	//new�Ҷ� ���������� ���簡 �Ǿ� ������ ��ǰ�� �������� ����Ǳ� ����
	public int ch; //0���� �ʱ�ȭ
	public int vol;
	public boolean onOff; //false�ʱ�ȭ

	public void ä�����ٲٴ�() {
		int change = 1; //��������, local����, ���ú���
		System.out.println(ch + change +"��ȣ�� �ٲٴ�.");
	}

	public void ��Ʃ�庸��() {
		System.out.println(vol + "�� Ű���� �������� ����.");
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
	
	
	
}
