package ���.���ǹ�;

import java.util.Date;

public class �����λ� {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("�¸��");
		}else if (hour < 15) {
			System.out.println("�¾����ʹ�");
		}else if (hour < 19) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
	}

}
