package �ݺ���;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		//���۰�;���ǽ�;������;
		int iyou = 0;
		int you = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {//���ѷ���
			System.out.print("�Է�(0)����, (1)������, (2)���缮, (3)��ź>> ");
			int data = sc.nextInt();
			if (data == 0) {
				System.out.println("�ý��� �����մϴ�.");
				//break;
				System.out.println("������ : " + iyou);
				System.out.println("���缮 : " + you);
				System.out.println("��ź : " + bts);
				System.exit(0);
			}
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
		
	}

}
