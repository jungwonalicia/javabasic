package �迭�⺻;

import java.util.Random;

public class ����ä�� {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] ���� = new int[999];
		int[] ���� = new int[999];
		
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1; //1~4
		}
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1; //1~4
		}
		
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i + 1 + "��: " + ����[i] + "<->" + ����[i]);
		}
		System.out.println("======");
		int count = 0;
		for (int i = 0; i < ����.length; i++) {
			if(����[i] == ����[i]) {
				count++;
			}
		}
		System.out.println("������ ������ " + count);
	}
	
	
	

}
