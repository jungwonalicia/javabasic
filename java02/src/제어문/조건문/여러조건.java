package ���.���ǹ�;

import java.util.Date;

public class �������� {

	public static void main(String[] args) {
		//�ð�, ��¥�� �˷��ִ� ��ǰ
		//��Ʈ��+����Ʈ+o(����) : �ڵ�import
		//���콺�� ���� �÷��� ����, f2
		Date date = new Date();
		int hour = date.getHours();//6
		int min = date.getMinutes(); //41
		int sec= date.getSeconds();//22
		System.out.println("����ð��� " + hour + "�� " + min + "�� " + sec + "��");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println("������ " + year + "�� " + month + "�� " + today + "��");
		
	}

}
