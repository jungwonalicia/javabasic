package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class �����ڸ����׷��� {
	static int count = 0;

	public static void main(String[] args) {
		// f2: �ذ�å ����
		// �Ѳ����� import: ��Ʈ��+����Ʈ+o(����)
		JFrame f = new JFrame();
		// ���Ż�Ȳ�� �����ϴ� �迭
		int[] seat = new int[200];

		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i + "");
			f.add(b);

			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand());
					String choice = e.getActionCommand();
					int choice2 = Integer.parseInt(choice);
					seat[choice2] = 1;
					count++;
					JOptionPane.showMessageDialog(f, choice + "�� �¼��� ���ŵǾ����ϴ�.");
					f.setTitle("���� ���ż�: " + count + "��");
					JButton b2 = (JButton) e.getSource();
					b2.setBackground(Color.RED);
					b2.setEnabled(false);
				}
			});

		}
		f.setSize(800, 600);
		f.setTitle("���� ���� ��ư��");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		System.out.println("Ȯ�ο��Դϴ�.");
		String s = "ȫ�浿";

		JButton money = new JButton("�����ϱ�");
		f.add(money);
		money.setBackground(Color.yellow);
		money.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�迭�� 1�� �� ������ �������.
				int count2 = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count2++;
						seatNo = seatNo + " " + i;
					}
				}
				//���� �����ݾ� �˷��ּ���.!
				int payment = count2 * 10000;
				JOptionPane.showMessageDialog(f, "����� ������ �¼���ȣ�� " + seatNo);
				JOptionPane.showMessageDialog(f, "���� �����ݾ���" + payment + "��");
			}
		});

		f.setVisible(true);
	}

}
