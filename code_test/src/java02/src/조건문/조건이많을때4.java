package ���ǹ�;

import java.util.Date;

public class �����̸�����4 {

	public static void main(String[] args) {
		// �ڵ�import: ��Ʈ��+����Ʈ+o(����)
		Date date = new Date(); 
		int month = date.getMonth() + 1;
		int day = date.getDay(); //����
		System.out.println(day);
		switch (day) {
		case 0: case 6://�Ͽ���, �����
			System.out.println("�п��� ����");
			break;

		default:
			break;
		}
		
		
		
		
		
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default: //������
			System.out.println("����");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
