package ������;

import javax.swing.JOptionPane;

public class �⺻�����3 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("�����Է�1");
		String data2 = JOptionPane.showInputDialog("�����Է�2");
		
		int d1 = Integer.parseInt(data1); //"200"->200
		int d2 = Integer.parseInt(data2);
		
		int data3 = d2 + d1;//���������!
		
		JOptionPane.showMessageDialog(null, "������ ����� " + data3);
		

	}

}
