package ������;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class �⺻����±׷��� {
	private static JTextField text;

	public static void main(String[] args) {
		// �Է�
		// JFrame�����ؼ� ���!
		JFrame f = new JFrame();
		f.setSize(400, 500);

		JButton b = new JButton("\uB0B4\uB144 \uB098\uC774\uB294?");
		b.setFont(new Font("����", Font.BOLD, 40));
		b.setBackground(Color.MAGENTA);
		f.getContentPane().add(b);
		JLabel r1 = new JLabel("\uACB0\uACFC");

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = text.getText();
				System.out.println("�Է°��� " + data);
				int data2 = Integer.parseInt(data);
				int age = data2 + 1;
				//JOptionPane.showMessageDialog(f, "���� ���̴� " + age + "��");
				r1.setText("������ " + age + "��");
			}
		});

		JButton btnNewButton = new JButton("\uC791\uB144 \uB098\uC774\uB294?");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		text = new JTextField();
		text.setForeground(Color.RED);
		text.setFont(new Font("����", Font.BOLD, 50));
		text.setBackground(Color.YELLOW);
		f.getContentPane().add(text, BorderLayout.NORTH);
		text.setColumns(10);
		
		r1.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(r1, BorderLayout.EAST);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = text.getText();
				System.out.println("�Է°��� " + data);
				int data2 = Integer.parseInt(data);
				int age = data2 - 1;
				JOptionPane.showMessageDialog(f, "�۳� ���̴� " + age + "��");
			}
		});
		// ó��
		// ���

		f.setVisible(true);
	}

}
