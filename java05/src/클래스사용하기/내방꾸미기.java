package Ŭ��������ϱ�;

import Ŭ���������.TV;
import Ŭ���������.������;
import Ŭ���������.�޴���;

public class ����ٹ̱� {

	public static void main(String[] args) {
		
		TV myTv = new TV();
		myTv.ch = 100;
		myTv.vol = 50;
		myTv.onOff = true;
		System.out.println(myTv);
		
		TV yourTv = new TV();
		yourTv.ch = 200;
		yourTv.vol = 60;
		yourTv.onOff = false;
		System.out.println(yourTv);
		
		//main�޼��� �ȿ��� ��������� ������ ��� ��������(local����)
		//����Ÿ�� ������;
		//���ú����� ���� ����� �����Ⱚ�� ����ִ� ����!
		//���ú����� �ٷ� ����Ʈx, ����x
		//���ú����� �ʱ�ȭ�� �ݵ�� ���־�� �Ѵ�.
		//int count = 0;
		
		
		
		�޴��� p1 = new �޴���(); 
		p1.color = "�ݻ�";
		p1.company = "kg";
		p1.���ͳ��ϴ�();
		System.out.println("�� �޴��� ��: " + p1.color);
		System.out.println("�� �޴��� ��Ż�: " + p1.company);
		System.out.println(p1);
		
		// ������ 1����
		������ dog1 = new ������();
		dog1.¢��();
		dog1.���ڴ�();
//		dog1.color = "Ȳ���";
//		dog1.name = "�п�";
		System.out.println(dog1);
//		System.out.println("������ ��: " + dog1.color);
//		System.out.println("������ �̸�: " + dog1.name);
		
		
	}

}
