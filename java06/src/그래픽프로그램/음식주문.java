
package �׷������α׷�;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class �����ֹ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//f�� ������ ����(�ּ�)
		//�� �ּҸ� ������ ��������� �����ؼ� ���� ���� ���� �ְ�,
		//�� �ּҸ� ������ ����޼��带 ����� ���� �ִ�.
		f.setSize(500, 500);
		f.setVisible(true);
		
		String name = JOptionPane.showInputDialog("�̸��� �Է�");
		JOptionPane.showMessageDialog(f, "����� �̸��� " + name);
		
		
		
		
		
		
		
		
		
	}

}

