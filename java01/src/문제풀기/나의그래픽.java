package ����Ǯ��;

import java.net.ServerSocket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
		// ctrl + d(���ٻ���)
		JFrame f = new JFrame();
		JButton b = new JButton("���� ��ư....!!!!");
		f.add(b);
		ImageIcon i = new ImageIcon("car.jpg");
		b.setIcon(i);
		//ServerSocket server = new ServerSocket();
		f.setSize(1000, 500);
		f.setVisible(true);
	}

}
