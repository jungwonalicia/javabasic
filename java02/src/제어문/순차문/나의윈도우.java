package ���.������;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ���������� {

	public static void main(String[] args) {
		// Ʋ(frame)�� �ش��ϴ� ��ǰ�� ��� �Ѵ�.
		JFrame f = new JFrame();
		f.setSize(482, 448);
		
		JButton b3 = new JButton("\uAC00\uC6B4\uB370");
		b3.setBackground(Color.GRAY);
		b3.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b1 = new JButton("\uBD81\uCABD");
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(b1, BorderLayout.NORTH);
		
		JButton b4 = new JButton("\uC11C\uCABD");
		b4.setFont(new Font("����", Font.BOLD, 30));
		b4.setBackground(Color.RED);
		f.getContentPane().add(b4, BorderLayout.WEST);
		
		JButton b2 = new JButton("\uB3D9\uCABD");
		b2.setBackground(Color.CYAN);
		b2.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(b2, BorderLayout.EAST);
		
		JButton b5 = new JButton("\uB0A8\uCABD");
		b5.setBackground(Color.MAGENTA);
		b5.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(b5, BorderLayout.SOUTH);
		f.setVisible(true);

	}

}
