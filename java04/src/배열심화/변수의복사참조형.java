package �迭��ȭ;

public class �����Ǻ��������� {

	public static void main(String[] args) {
		int[] x = {10, 20, 30};
		//int[] y = x; //�ּҸ� ����!(�迭�� ���� ����)
		int[] y = x.clone(); //����� ����!(�迭�� ���� ����)
		System.out.print("������ X: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("������ Y: ");
		for (int a : y) {
			System.out.print(a + " ");
		}
		System.out.println("\n--------------");
		x[0] = 99; //������
		System.out.print("������ X: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("������ Y: ");
		for (int a : y) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("X�� �ּ�: " + x);
		System.out.println("Y�� �ּ�: " + y);

	}

}
