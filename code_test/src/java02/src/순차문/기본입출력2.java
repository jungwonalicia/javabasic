package ������;

import javax.swing.JOptionPane;

public class �⺻�����2 {

	public static void main(String[] args) {
		// �⺻�����2.java
		//�Է�: ����� �����? ����
		//     ����� ���� ���� ����? ī��
		String data1 = JOptionPane.showInputDialog("����� �����?");
		String data2 = JOptionPane.showInputDialog("����� ���� ���� ����?");
		
		//ó��: "ī�䰡 ����"
		String data3 = data2 + "�� " + data1;
		
		//���: ���� ī�䰡 ����
		JOptionPane.showMessageDialog(null, "���� " + data3);
		

	}

}
