package ���;

import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		// �Է�---> ó��---> ���
		//�Է�
		String today = JOptionPane.showInputDialog("���� ������");
		String temp = JOptionPane.showInputDialog("���� �µ���");
		
		//ó��:temp String�� double�� �ٲپ��־�� �񱳿����ڸ� �� �� ����.
		double temp2 = Double.parseDouble(temp);
		String result = "";
		if (temp2 > 0) {
			result = "���� ������!";
		} else {
			result = "���� �߿���!";
		}
		
		//���
		JOptionPane.showMessageDialog(null, today + "�� " + result);
	}

}
