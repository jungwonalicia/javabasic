package �迭����;

import java.util.Random;

public class ���͹��� {

	public static void main(String[] args) {
		// ���͹����� ����� 999��
		// �� ����� 999��
		int[] ��� = new int[999]; // {0,0,....}
		int[] ���� = new int[999];

		// 1~4�� ������
		Random r = new Random(5); // ���Ѱ�(seed�� ����)
		for (int i = 0; i < ���.length; i++) {
			���[i] = r.nextInt(4) + 1; // 0~3 + 1 => 1~4
		}
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1; // 0~3 + 1 => 1~4
		}
		for (int i = 0; i < ���.length; i++) {
			System.out.println(i + ": " + ���[i] + " <-> " + ����[i]);
		}
		// ���� ���� ī��Ʈ, Ʋ�� ���� ī��Ʈ
		// ���� ������ ���������� ���
		int count = 0, count2 = 0;
		for (int i = 0; i < ����.length; i++) {
			if (���[i] == ����[i]) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("���� ����: " + count + "��");
		System.out.println("Ʋ�� ����: " + count2 + "��");
		System.out.println("���� ����: " + count + "��");

	}

}
