package �׷������α׷�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ���Ǳ׷��� implements ActionListener {
	static JButton b1, b2;
	
	public static void main(String[] args) {
		//static�޼���� ��ü�������� �ʾƵ� ������ �� �ִ� �޼���
		//static�޼��峻���� ����ϴ� ���������� static�̿����Ѵ�.
		JFrame f = new JFrame();
		f.setSize(600, 300);

		b1 = new JButton("���� ������");
		b2 = new JButton("���� ������");

		f.setLayout(new FlowLayout());

		f.add(b1);
		f.add(b2);

		b1.setFont(new Font("�ü�", Font.BOLD, 100));
		b1.setBackground(Color.RED);

		b2.setFont(new Font("����", Font.ITALIC, 100));
		b2.setBackground(Color.YELLOW);

		
		b1.addActionListener(new ���Ǳ׷���());
		b2.addActionListener(new ���Ǳ׷���());

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("���� ��ư�� ����.!");
		}else {
			System.out.println("��� ��ư�� ����.!");
		}
	}

}
