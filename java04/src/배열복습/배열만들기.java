package �迭����;

import javax.swing.JOptionPane;

public class �迭����� {

	public static void main(String[] args) {
		// �迭�� ���� �� ������� �����͸� �̹� �˰� �ִ� ���
		String[] name = {"��浿","ȫ�浿","�����","�����"};
		
		// �迭�� ���� �� ������� �����͸� ���� �𸣰� �ִٰ� ���߿� �ִ� ���
		// �迭�� �ڵ��ʱ�ȭ�� �����ش�.
		String[] job = new String[4]; //{null, null, null, null}
		for (int i = 0; i < job.length; i++) { //0~3
			job[i] = JOptionPane.showInputDialog("��� ���� �Է�");
		}
		for (int i = 0; i < job.length; i++) {
			System.out.println(job[i]);
		}
		
		//�츮������ �÷�(double)�� �־, ����Ʈ
		double[] eyes = {2.0, 1.5, 1.2, 0.8};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		
		//�츮������ ����(char)�� �־, ����Ʈ
		char[] gender = {'��','��','��','��'};
		String[] gender2 = {"��", "��", "��", "��"};

		for (char c : gender) {
			System.out.println(c);
		}
		
	}//main
}//class





