package �׷������α׷�;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ����ȯ�׷��� {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(500, 500);
		
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout()); //�ڵ�����ȯ (ū<--��)
		
		JButton b = new JButton();
		b.setText("���� ��ư");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ������.");
				
			}
		});
		
		JLabel l = new JLabel();
		l.setText("���� ��");
		
		f.add(b); //Component(�θ�, ū) <---- JButton(�ڽ�, ��), �ڵ�����ȯ
		f.add(l); //Component          <---- JLabel
			      //�ϳ��� �̸����� �پ��� ���¸� �����ϴ� Ư¡!!
				  //            ��       ��                  ��(������)=> overloading(�����ε�)
		
		f.setVisible(true);
	}

}
