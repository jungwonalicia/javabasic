package �迭����;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ��ȭ�ٹ������ {
	static int start = 2;

	public static void main(String[] args) {
		String[] title = { "�ҿ�", "Ŀ��Ʈ", "�������", "ȭ�翬ȭ", "���̿�����" };
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		double[] jumsu = { 99.9, 88.8, 77.7, 66.6, 55.5 };
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setBackground(Color.GREEN);
		f.setSize(562, 548);

		JLabel t1 = new JLabel(title[start]);
		t1.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(t1, BorderLayout.NORTH);

		ImageIcon icon = new ImageIcon(img[start]);
		JLabel t2 = new JLabel(icon);
		f.getContentPane().add(t2, BorderLayout.CENTER);

		JLabel t3 = new JLabel(jumsu[start] + "");
		t3.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(t3, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���� ��ư�� ������ ���� ��ġ���� -1�� ���־�� �Ѵ�.
				// start�� ���� ��ġ���� �������.
				if(start != 0) {
					start--;
					t1.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					t2.setIcon(icon);
					t3.setText(jumsu[start] + "");
				}else {
					JOptionPane.showMessageDialog(f, "������ ���Դϴ�.");
				}
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start != 4) {
					start++;
					t1.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					t2.setIcon(icon);
					t3.setText(jumsu[start] + "");
				}else {
					JOptionPane.showMessageDialog(f, "�������� ���Դϴ�.");
				}
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
	}

}

