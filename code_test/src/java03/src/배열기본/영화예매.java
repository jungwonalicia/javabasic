package �迭�⺻;

import java.util.Scanner;

public class ��ȭ���� {

	public static void main(String[] args) {
		// �¼� ���Ż�Ȳ�� ��Ÿ���� �ڸ���(�迭)
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		final int PRICE = 10000; //���

		int count = 0;
		while (true) {
			System.out.println("=========================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			System.out.print("������ ��ȣ�� �Է�(����-1)>> ");
			int no = sc.nextInt(); // "1"-->1
			if (no == -1) {
				System.out.println("���� �ý����� �����մϴ�.");
				System.out.println("����� �����ݾ�>> "+ (count * PRICE) + "��");
				break; // �ݺ��� ����
			}

			// ����ó���ؾ���.
			// no�� 1�̶��, ��ġ���� 0�� ��.
			if (seat[no - 1] != 1) {
				seat[no - 1] = 1;
				count++;
				System.out.println("����ó�� �Ϸ�!");
			}else {
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				System.out.println("�ٸ� ��ȣ�� �������ּ���.");
			}
		}
	}
}
