package ���;

import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		// �Է�
		String data = JOptionPane.showInputDialog("���̸� �Է����ּ���.");// 100

		// ó��(���� ����)
		int age = Integer.parseInt(data);//"100"->100
		int nextAge = age + 1;
		//��Ÿǥ���
		
		// ���
		JOptionPane.showMessageDialog(null, "���� ���̴� " + nextAge);
		
		
	}

}
