package ���.���ǹ�;

import javax.swing.JOptionPane;

public class ����Ļ� {

	public static void main(String[] args) {
		String food 
			= JOptionPane.showInputDialog("���ῡ ���� ���� ������ 1)¥���, 2)�쵿, 3)���");
		switch (food) {
		case "¥���": 
			System.out.println("�߱������� ����!");
			break;
		case "�쵿": 
			System.out.println("�Ͻ������� ����!");
			break;
		case "���": 
			System.out.println("�н������� ����!");
			break;
		default: //if���� else���
			System.out.println("������ �Ծ��!");
			break;
		}
		
		
	}

}
