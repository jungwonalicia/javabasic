package �迭����;

import java.util.Random;


public class �ƹ��ų�������ִº�ǰ {

	public static void main(String[] args) {
		//����(random)
		int[] num = new int[100];
		Random r = new Random();//������(�ּ�)
		for (int i = 0; i < 100; i++) {
			int data = r.nextInt(100); //-21~21��=>0~99
			num[i] = data;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i +": " + num[i]);
		}
		

	}
}
