package �迭��ȭ;

public class �迭�Ǳ������� {

	public static void main(String[] args) {
		// ���� ����: �迭�� �ּҰ� ����Ű�� ������ ����Ʈ�� ����
		// ����, ����, ����, ��ǻ��(100)
		int[] term1 = {100, 99, 77, 44};
		int[] term2 = term1.clone();
		term2[3] = 100;
		
		System.out.print("1�б� ����>> ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + " ");
		}
		System.out.println();
		System.out.print("2�б� ����>> ");
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		System.out.println();
	}

}
