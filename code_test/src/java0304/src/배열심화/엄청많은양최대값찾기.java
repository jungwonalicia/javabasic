package �迭��ȭ;

import java.util.Random;

public class ��û�������ִ밪ã�� {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);//0~999
		}
		
		//�ִ밪�� ã�ƺ�����.
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		int max = num[0];
		int count = 0;
		String total = "";
		for (int i = 1; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
				//System.out.println("��ġ�� " + i);
				total = total + " " + i;
				count++;
			}
		}
		
		System.out.println("�ִ밪�� " + max);
		System.out.println("�ִ밪�� ������  " + count);
		System.out.println("�ִ밪�� ��ġ��  " + total);

	}
}




