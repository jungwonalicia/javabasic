package ������;

import javax.swing.JOptionPane;

public class �⺻�����5 {

	public static void main(String[] args) {
		final double PI = 3.14;//���
		String data1 = JOptionPane.showInputDialog("�������Է�");

		double d1 = Double.parseDouble(data1);

		double result = PI * d1 * d1;// ���������!

		JOptionPane.showMessageDialog(null, "���� ������ " + result);

	}

}
