package �ݺ���;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		//���۰�;���ǽ�;������;
		int iyou = 0;
		int you = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {//0~9, 10ȸ �ݺ�
			System.out.print("�Է�(1)������, (2)���缮, (3)��ź>> ");
			int data = sc.nextInt();
			switch (data) {
			case 1:
				iyou++;//����������
				break;
			case 2:
				you++; //you = you + 1
				break;
			default:
				bts++; 
				break;
			}
		}
		System.out.println("������ : " + iyou);
		System.out.println("���缮 : " + you);
		System.out.println("��ź : " + bts);
	}

}
