package ������;

public class ���������2 {

	public static void main(String[] args) {
		// ��Ʈ��+����Ʈ+f: �ڵ�����
		int sum = 333; // ����
		int count = 5; // �ο�

		System.out.println(sum / count);
		//�ڹٴ� cpu�� ������ ��, int�� �ٲپ ���
		//int�� int�� ���� ����� ������ int!
		
		//�Ҽ����� �츮�� doubleŸ���� �����͸� ���ϸ�,
		//�ϳ��� double�̸�, ������ double
		double avg = (double)sum / count;
		//������Ÿ�Ժ�ȯ(��������ȯ)
		//cpu�� ram�� �ִ� �����͸� �����ٰ�
		//������ Ÿ���� ��ȯ�ϴ� ��
		//sum + 1;
		System.out.println("����� " + avg);
	}

}





