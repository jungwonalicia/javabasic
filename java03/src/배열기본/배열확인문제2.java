package �迭�⺻;

import javax.swing.JOptionPane;

public class �迭Ȯ�ι���2 {

	public static void main(String[] args) {
		// 1. int[]
		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = (i + 1) * 10;
		}
		System.out.println(s[0] + s[1]);

		// 2. String[]
		String[] s2 = new String[3];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = JOptionPane.showInputDialog("���� �Է�");
		}
		System.out.println("**" + s2[0] + "���ٴ� " + s2[1] + "**");

		// 4. int[]
		int[] s3 = new int[5];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = i + 1;
			// s3[0] = 0 + 1;
			// s3[1] = 1 + 1;
		}
		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i] + " ");
		}
		
		System.out.println();
		// 3. �迭�� �־��� ���� �迭�� ���鶧 �̹� �˰� �ִ� ���,
		// ó������ ������ �ȴ�.
		int[] s4 = { 11, 22, 33, 44 };
		for (int i = 0; i < s4.length; i++) {
			if (s4[i] == 33) {
				System.out.println("33�� ã��.");
				System.out.println("��ġ�� " + i);
				break;//�ݺ��� ����!
			}
		}

	}

}
