package �迭����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ��ȭ�ٹ� {
	static int now = 2; //���� ��ġ

	public static void main(String[] args) {
		// ��ȭ���� �迭
		String[] name = { "�����׷�", "�㺸", "���÷���", "�̽���Ʈ��", "�Ҹ�������" };

		// ��ȭ����Ʈ �迭
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };

		// ���� �迭
		double[] jumsu = { 9.8, 8.8, 7.8, 6.8, 5.8 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("��ȭ �ٹ� �����");
		f.setSize(447, 485);

		JButton left = new JButton("<<");
		left.setBackground(Color.GREEN);
		left.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(left, BorderLayout.WEST);
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now--;
				System.out.println("���� ��ư�� ������>> " + now);
			}
		});
		
		
		JButton right = new JButton(">>");
		right.setBackground(Color.GREEN);
		right.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now++;
				System.out.println("������ ��ư�� ������>> " + now);
			}
		});
		
		JLabel title = new JLabel(name[2]);
		title.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(title, BorderLayout.NORTH);

		JLabel avg = new JLabel(jumsu[2] + "");
		avg.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(avg, BorderLayout.SOUTH);

		JLabel poster = new JLabel("");
		poster.setIcon(new ImageIcon(img[2]));
		f.getContentPane().add(poster, BorderLayout.CENTER);
		f.setVisible(true);

	}

}
