package ����Ǯ��;

import javax.swing.JOptionPane;

public class �⺻�����2 {

	public static void main(String[] args) {
//		�Է�
//		�̸� �Է�: ��浿
//		���� �Է�: 100  <=> ��ȭ��ȣ: "011"
//		�Ҽ� �Է�: kg
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String age = JOptionPane.showInputDialog("���� �Է�"); //"100"
		String company = JOptionPane.showInputDialog("�Ҽ� �Է�");
//
//		ó��
//		��浿�� ���̴� 100���̰�, �Ҽ���  kg�Դϴ�.
		String result = name + "�� ���̴� " + age + "���̰�, �Ҽ��� " + company + "�Դϴ�.";
		//+: ���� ����(��� ������)
		//+: ���� ����(���� ������)=> 
		//   ���� ��Ű�� ������ �� �ϳ��� String�� ������ �������� �Ǵ�.
//
//		���
//		ó���� ����� ȭ�鿡 ���̾�α׷� �����ּ���.
		JOptionPane.showMessageDialog(null, result);
	}

}
