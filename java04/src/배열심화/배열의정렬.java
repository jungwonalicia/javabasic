package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �迭������ {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		Random r = new Random(33);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000);
		}
		Arrays.sort(jumsu); //��������
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		System.out.println("�ִ밪�� " + jumsu[jumsu.length - 1]);
		
		
		

	}

}
