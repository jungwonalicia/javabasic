package ���.������;

import javax.swing.JOptionPane;

public class �⺻����� {

	public static void main(String[] args) {
		// ������
		// 1. �Է�
		String name = "ȫ�浿";
		//�ѱ����̻� ������ char���� �Ƿ� ������� String ��ǰ�� ���!
		//String ��ǰ�� �⺻������ó�� ���� ���ǹǷ�, ������ �⺻��ó�� �� �� �ִ�.
		String name2 = JOptionPane.showInputDialog("����� �̸��� "); //"��浿"
		
		// 2. ó��
		String result = name2 + "�� ȯ���մϴ�.";
		
		// 3. ���
		JOptionPane.showMessageDialog(null, result);
	}

}
