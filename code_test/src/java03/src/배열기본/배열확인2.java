package �迭�⺻;

import javax.swing.JOptionPane;

public class �迭Ȯ��2 {

	public static void main(String[] args) {
		//4
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			num3[i] = i + 1;
		}
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i]);
		}
		
		//3
		int[] num2 = { 11, 22, 33, 44};
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] == 33) {
				System.out.println("��ġ�� " + i);
			}
		}
		// 2
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			data[i] = JOptionPane.showInputDialog("�����Է�");
		}
		System.out.println("**" + data[0] + "���ٴ� " + data[1] + "**");

		// 1
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println(num[0] + num[1]);

	}

}
