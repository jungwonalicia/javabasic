package �÷���;

import java.util.ArrayList;

public class ��������ũ����� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//�ƹ�Ÿ���� �� ������� ���� �� �ִ�.
		list.add("ȫ�浿"); //����� ���� ��
		list.add(100);
		list.add(11.22);
		list.add(true);
		list.add('��');
		System.out.println("��ü ��� Ȯ�� " + list);
		System.out.println("����� ���� " + list.size() + "��");
		System.out.println(list.get(0));
		System.out.println(list.get(1)); //��Ͽ��� ���� ��
		list.remove(0);
		System.out.println("��ü ��� Ȯ�� " + list);
		System.out.println("����� ���� " + list.size() + "��");
		

	}

}
