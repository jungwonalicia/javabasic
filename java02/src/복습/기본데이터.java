package ����;

import javax.swing.JOptionPane;

public class �⺻������ {

	public static void main(String[] args) {
		// �⺻������ 4����: ����, �Ǽ�, ����, ��
		int temp = 30; //�������: ����, ��������̸�: ������
		double move = 0.5;
		char color = 'b';
		//��Ʈ��+�����̽��� : �ڵ��ϼ�
		boolean open = false; //true
		System.out.println("�µ��� " + temp); //���տ�����
		//sysout + ��Ʈ��+�����̽���
		//null: ������ �ǹ�,��!
		JOptionPane.showMessageDialog(null, "�µ��� " + temp);
		JOptionPane.showMessageDialog(null, "������ �µ����� " + move + "��");
		JOptionPane.showMessageDialog(null, "�� �� " + color);
		JOptionPane.showMessageDialog(null, "�� �����ִ������� " + open);
		
	}

}
