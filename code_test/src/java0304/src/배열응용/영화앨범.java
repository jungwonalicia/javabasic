package �迭����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ��ȭ�ٹ� {
	static int now = 2; //���� ��ġ

	public static void main(String[] args) {
		//������ ��ġ�� ������ ��������� ��ġ!
		
		
		// ��ȭ���� �迭
		String[] name = { "�����׷�", "�㺸", "���÷���", "�̽���Ʈ��", "�Ҹ�������" };

		// ��ȭ����Ʈ �迭
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };

		// ���� �迭
		double[] jumsu = { 9.8, 8.8, 7.8, 6.8, 5.8 };
		
		JLabel title = new JLabel(name[2]);
		JLabel avg = new JLabel(jumsu[2] + "");
		JLabel poster = new JLabel("");
		
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
				if (now > 0) {
					now--;
					System.out.println("���� ��ư�� ������>> " + now);
					title.setText(name[now]);
					avg.setText(jumsu[now] + "");
					ImageIcon icon = new ImageIcon(img[now]);
					poster.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "���ʳ��Դϴ�.");
				}
			}
		});
		
		
		JButton right = new JButton(">>");
		right.setBackground(Color.GREEN);
		right.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now < 4) {
					now++;
					System.out.println("������ ��ư�� ������>> " + now);
					title.setText(name[now]);
					avg.setText(jumsu[now] + "");
					ImageIcon icon = new ImageIcon(img[now]);
					poster.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "������ ���Դϴ�.");
				}
			}
		});
		
		title.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(title, BorderLayout.NORTH);

		
		avg.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(avg, BorderLayout.SOUTH);

		
		poster.setIcon(new ImageIcon(img[2]));
		f.getContentPane().add(poster, BorderLayout.CENTER);
		f.setVisible(true);

	}

}
