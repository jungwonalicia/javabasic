package �迭����;

public class ������������ {


	public static void main(String[] args) {
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		//1. ������ 2�б⿡ ���� �л��� ���� ī��Ʈ�ؼ� ����Ʈ
		//2. ������ 1,2�б� ������ �л��� ���� ī��Ʈ�ؼ� ����Ʈ
		int count = 0; //���� �л� ��
		int count2 = 0; //������ �л� ��
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}else if (term1[i] == term2[i]) {
				count2++; 
			}
		}
		System.out.println("���� �л��� " + count + "��");
		System.out.println("������ �л��� " + count2 + "��");
	}

}
