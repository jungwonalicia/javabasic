package �迭����;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class �����ڸ����׷��� {

	public static void main(String[] args) {
		//f2: �ذ�å ����
		//�Ѳ�����  import: ��Ʈ��+����Ʈ+o(����)
		JFrame	f = new JFrame();
		
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton();
			b.setText(i+"");
			f.add(b);
		}
		f.setSize(1000, 800);
		f.setTitle("���� ���� ��ư��");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		System.out.println("Ȯ�ο��Դϴ�.");
		String s = "ȫ�浿";
		
		f.setVisible(true);
	}

}
