package �迭�⺻;

import javax.swing.JOptionPane;

public class �ݺ��Է����� {

	public static void main(String[] args) {
		int[] s = new int[5]; //{1,2,3,4,5}
		for (int i = 0; i < 5; i++) {
			String jumsu = JOptionPane.showInputDialog("�����Է�");
			s[i] = Integer.parseInt(jumsu);
		}
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i];
		}
		System.out.println("����� " + sum / s.length);
	}
}
