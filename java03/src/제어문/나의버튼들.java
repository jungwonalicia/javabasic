package ���;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;

public class ���ǹ�ư�� {
	static int count = 0;
	
	public static void main(String[] args) {
		// RAM�� �����ؼ� ��ǰ���� �Ẹ��.
		JFrame f = new JFrame();
		f.setSize(1300, 1000);
		int[] seat = new int[500];
		for (int i = 0; i < 500; i++) {
			JButton btnNewButton = new JButton(i + "");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // ��ư���� ���ڸ� ������ �� �� ����
					JOptionPane.showMessageDialog(f, s + "�� ������.");
					btnNewButton.setEnabled(false); //Ŭ����� ���ֹ���
					btnNewButton.setBackground(Color.red);
					int s2 = Integer.parseInt(s);
					seat[s2] = 1; //�ش�index�ڸ��� ���� 1�� �����ϸ�, ����Ǿ��ٶ�� ó��!
					System.out.println(s2 + ": " + seat[s2]);
				}
			});
			f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			f.getContentPane().add(btnNewButton);
		}
		
		
		JButton result = new JButton("�����ϱ�");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�迭�� �� �� 1�� ���� ã�Ƽ� ��ġ�� ����Ʈ!
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						System.out.println("����� �¼���ȣ�� >> " + i);
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, count * 10000 + "�� �����ϼ���.");
			}
		});
		result.setBackground(Color.pink);
		f.getContentPane().add(result);
		
		
		
		f.setVisible(true);
	}
}
