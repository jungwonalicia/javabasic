package ������;

import javax.swing.JOptionPane;

public class �⺻�����4 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("�����Է�1");
		String data2 = JOptionPane.showInputDialog("�����Է�2");
		String data3 = JOptionPane.showInputDialog("�����Է�2");
		String data4 = JOptionPane.showInputDialog("�����Է�2");

		int d1 = Integer.parseInt(data1); // "200"->200
		int d2 = Integer.parseInt(data2);
		int d3 = Integer.parseInt(data3);
		int d4 = Integer.parseInt(data4);

		int sum = d1 + d2 + d3 + d4;// ���������!
		double avg = (double)sum / 4;

		JOptionPane.showMessageDialog(null, "����� " + avg);

	}

}
