package ���ǹ�;

import java.util.Date;

public class �����̸�����2 {

	public static void main(String[] args) {
		// �ڵ�import: ��Ʈ��+����Ʈ+o(����)
		Date date = new Date(); // f2
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "�� " + min + "�� "  + sec + "��");
		
		int year = date.getYear();
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + 1900 + "�� " + month + "�� " + today + "��");
		
		
		
		
		
		
		
		
		
	}

}
