package ������;

import javax.swing.JOptionPane;

public class �⺻����� {

	public static void main(String[] args) {
		// 1. �Է�
		String day = JOptionPane.showInputDialog("������ ���� �����ΰ���");
		
		// 2. ó��
		String result = "";
		if (day.equals("�Ͽ���") || day.equals("�����")) {
			result = "�ָ��� �ʹ� ���ƿ�!!!";
		} else {
			result = "������ �ʹ� �Ⱦ��!!!";
		}
		
		// 3. ���
		//System.out.println("����� �Է��� ������ " + day + " " + result);
		JOptionPane.showMessageDialog(null, "����� �Է��� ������ " + day + " " + result);
		
	}

}
