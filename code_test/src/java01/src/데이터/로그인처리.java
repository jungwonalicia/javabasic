package ������;
import javax.swing.JOptionPane;

public class �α���ó�� {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("����� id�Է��ϼ���.");
		String pw = JOptionPane.showInputDialog("����� pw�Է��ϼ���.");
		//������� ���� ����: ��Ʈ��+��Ʈ+ȭ��ǥ �Ʒ�
		//���� �̵�: ��Ʈ+ȭ��ǥ ����
		//�� ������: == ���Ұ�
		String id2 = "root";
		System.out.println(id.equals(id2));
		//���� ����� �׻� boolean(����), true/false
		
		String pw2 = "pass";
		System.out.println(pw.equals(pw2));
		
		System.out.println(id.equals(id2) && pw.equals(pw2));
		
		
		
		
		
		
		
	}

}
