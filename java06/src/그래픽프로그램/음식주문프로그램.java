package �׷������α׷�;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �����ֹ����α׷� {
	//main�޼���� ���α׷��� ó�������� �� �ڵ����� �����ϴ� �޼���
	//ó�������� �� ��ü���������ʾƵ� �ڵ����� ������ �Ǿ���ϱ� ������
	//main�޼���� static�� ���ۿ� ����.
	//static�޼���ȿ��� ����ϴ� ���������� �ݵ��
	//��ü�������� �ʾƵ� ������ ������ static�������� �Ѵ�.
	private static JTextField t1;
	static int count; //���������� �ڵ��ʱ�ȭ, 0���� �ʱ�ȭ
	final static int PRICE = 5000;
	//final�� ���ָ�, ����Ұ����� �������� ����, �������!
	//final�� �̿��ؼ� ����� �����ϸ� �������� ��� �빮�ڷ� ���ָ� ����.!
	
	public static void main(String[] args) {
		//JFrame�����Ǵ� �����Ǵ� ������ �� �����ؼ� ��ü���� ����
		//�������� �ʴ� �Է°��� �־�� ��ü���� �Ұ���.
		//JFrame()������ �޼���� �Է°��� �ٸ��� �ϸ�, ������ ������ִ�.
		//�޼����̸��� �Է°��� �ٸ��ٸ� �Ȱ��� �����ᵵ �ȴ�.
		//�ϳ��� ������ �޼��� �̸����� �پ��� �Է����¸� ������ �޼��带 ���� �� �ִ�.
		//=> ������(overloading, �����ε�)
		JFrame f = new JFrame("���� ���� �ֹ� ���α׷�");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(773, 637);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.BOLD, 30));
		t1.setBounds(505, 29, 213, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218:");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 17));
		lblNewLabel.setBounds(428, 29, 66, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel t2 = new JLabel("");
		t2.setIcon(new ImageIcon("D:\\java-ws\\java06\\005.png"));
		t2.setBounds(54, 100, 618, 392);
		f.getContentPane().add(t2);
		
		JLabel t3 = new JLabel("\uACB0\uC81C\uAE08\uC561 \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		t3.setForeground(Color.RED);
		t3.setFont(new Font("����", Font.BOLD, 30));
		t3.setBounds(69, 521, 591, 56);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //����������
				t1.setText(count + "��");
				t3.setText("�����ݾ��� " + count * PRICE + "��");
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("����", Font.BOLD, 30));
		btnNewButton.setBounds(36, 10, 110, 79);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //����������
				t1.setText(count + "��");
				t3.setText("�����ݾ��� " + count * PRICE + "��");
				ImageIcon icon = new ImageIcon("006.png");
				t2.setIcon(icon);
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 30));
		btnNewButton_1.setBounds(168, 10, 110, 79);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC9DC\uC7A5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //����������
				t1.setText(count + "��");
				t3.setText("�����ݾ��� " + count * PRICE + "��");
				ImageIcon icon = new ImageIcon("005.png");
				t2.setIcon(icon);
			}
		});
		btnNewButton_1_1.setBackground(Color.CYAN);
		btnNewButton_1_1.setFont(new Font("����", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(306, 10, 110, 79);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
