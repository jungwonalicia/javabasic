package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		Random r = new Random();
		
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.print("�����Է�>> ");
			int data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("����� �õ�Ƚ���� " + count);
				System.out.println("�����Դϴ�.");
				break;
			}else {
				System.out.println("������ �ƴմϴ�.");
				if (data > target) {
					System.out.println("�ʹ� Ŀ��");
				}else {
					System.out.println("�ʹ� �۾ƿ�");
				}
			}
		}
	}

}
