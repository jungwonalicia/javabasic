package �迭�⺻;

import javax.swing.JOptionPane;

public class �Է��ؼ��迭���Ѳ������ֱ� {

	public static void main(String[] args) {
		String[] data = new String[4];
		                //{"��ǻ��","����","����","����"}
		//�������� ������ null�� �ʱ�ȭ
		//null(��): �ּҰ� ����!
		for (int i = 0; i < data.length; i++) {
			data[i] = JOptionPane.showInputDialog("�����ϴ� ������");
			System.out.println("����� �����ϴ� ������ " + data[i]);
		}
		
		for (int i = 0; i < data.length; i++) {
			if(data[i].equals("��ǻ��")){
				System.out.println("��ǻ�Ͱ� �־��");
			}
					
		}
	}

}





