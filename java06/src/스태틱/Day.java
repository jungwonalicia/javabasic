package ����ƽ;

public class Day {
	String doing; //�ν��Ͻ� ����
	int time; //�ν��Ͻ� ����
	String location; //�ν��Ͻ� ����
	static int count;//���������� �ڵ� �ʱ�ȭ. Ŭ���� ����, ���� ����
	//�������� �߿��� ������ ��ü���� ������ų ������ ������
	//������ ��ü���� ���� ���� ���� �� ��ü�� ������(instance)�� ��������,
	//Ŭ������ �ϳ��� �����鼭 ������ ��ü���� �����Ͽ� �� �� �ִ� ������ ������.!
	static int sum; //��������, Ŭ��������
	//��ü������ ������� Ŭ������ �ϳ��� ������ �����鼭 �����ؼ� ����ϴ� ����
	
	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	public static void getAvg() {
		//static�޼��� ������ ����ϴ� ���������� �ݵ�� static�� �Ǿ�� ��.
		System.out.println(sum / count);
	}
	
}





