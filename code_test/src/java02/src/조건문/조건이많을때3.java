package ���ǹ�;

import java.util.Date;

public class �����̸�����3 {

	public static void main(String[] args) {
		// �ڵ�import: ��Ʈ��+����Ʈ+o(����)
		Date date = new Date(); // f2
		int hour = date.getHours();
		
		//11�� ���̸� �¸��
		//17�� ���̸� �¾����ʹ�
		//20�� ���̸� ���̺��
		//�³���
		String result = "";
		if (hour < 11) {
			result = "�¸��";
		}else if (hour < 17) {
			result = "�¾����ʹ�";
		}else if (hour < 20) {
			result = "���̺��";
		}else {
			result = "�³���";
		}
		
		System.out.println(result);
		
		System.out.println("=================");
		switch (hour) { //int, char, String
		case 9:
			System.out.println("���� �ð�");
			break;
		case 19:
			System.out.println("���� �ð�");
			break;
		default:
			System.out.println("�������̰ų� ���̰ų�");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
