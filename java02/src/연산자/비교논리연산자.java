package ������;

import javax.swing.JOptionPane;

public class �񱳳������� {

	public static void main(String[] args) {
		// ==, !=, >, >=, <, <= 
		//�񱳿������� ����� ���� Ÿ���ϱ��?
		//�׻� boolean(true/false)
		//�񱳿����ڴ� �⺻���� �� �����ϴ�.
		char ��й�ȣ = 'p';
		char �Է¹�ȣ = 'q';
		if (��й�ȣ == �Է¹�ȣ) { //������(true)
			JOptionPane.showMessageDialog(null, "�����ϼ���.");
		} else { //Ʋ����(false)
			JOptionPane.showMessageDialog(null, "���Է��ϼ���.");
		}
		
		double change = 2.2;
		if (change > 2) { //true
			JOptionPane.showMessageDialog(null, "���̾�Ʈ ����");
		}
		
		//��������: ������ ���� ���� ��� ���
		//��� ������ ���  true�̸� ����� true��� �Ǵ��ϰ� ���� ���
		//and������(&&)
		//�ϳ��� ������ true�̸� ����� true��� �Ǵ��ϰ� ���� ���
		//or������(||)
		if (��й�ȣ == �Է¹�ȣ  ||  change > 2) {
			JOptionPane.showMessageDialog(null, "������ ����");
		} else {
			JOptionPane.showMessageDialog(null, "���� �ٽ� ����");
		}
		
	}

}
