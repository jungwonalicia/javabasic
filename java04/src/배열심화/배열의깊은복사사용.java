package �迭��ȭ;

public class �迭�Ǳ��������� {

	public static void main(String[] args) {
		String[] ����� = {"����", "����", "����"};
		int[] term1 = {10, 20, 30};
		//2�б��� ������ 1�б�� ���� ����, ����° ���� 40����.
		int[] term2 = term1.clone();
		term2[2] = 40;
		
		//1,2�б� ������ ������ ������ ���� ����Ʈ
		//1,2�б� ������ ������ ����� ����Ʈ
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
				System.out.println(�����[i]);
			}
		}
		System.out.println("����� " + count);
		
	}
}
