package ���;

import javax.swing.JOptionPane;

public class �ݺ���1 {

	public static void main(String[] args) {
		//������ �´� ����(true�̸�) �ݺ��� �����Ѵ�.
		while (true) { //���ѷ���
			String data = JOptionPane.showInputDialog("�����ϽǷ���? 1)��, 2)�ƴϿ�");
			int data2 = Integer.parseInt(data);
			if (data2 == 1) {
				JOptionPane.showMessageDialog(null, "�����մϴ�.");
				break; //while�� ����
			} else {
				JOptionPane.showMessageDialog(null, "��� �����մϴ�.");
			}
		}
	}

}
