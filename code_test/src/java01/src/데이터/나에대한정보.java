package ������;

import javax.swing.JOptionPane;

public class ������������ {

	public static void main(String[] args) {
		// �⺻ �����Ϳ� ���� ���� ������ �־ ���
		// ����: ��Ʈ��+s
		// ����: ��Ʈ��+f11
		// �ڵ��ϼ�: ��Ʈ��+�����̽���
		int age = 100; //���Կ�����
		double eye = 2.0;
		char bus = 'b';
		boolean food = true;
		
		System.out.println("���� " + age); //���ᤩ������
		
		//�Ϲ������� 1���� �̻� �� String class!
		//�⺻���� ������ ������� ����/��°���
		//��Ʈ��(��): ȫ--��--��
		String name = "ȫ�浿";
		String tel = "010112223";
		System.out.println("�̸� " + name);
		
		
		String location = JOptionPane.showInputDialog("����� ����ΰ���");
		System.out.println("����� ��ġ�� " + location);
		
		
		

	}

}
