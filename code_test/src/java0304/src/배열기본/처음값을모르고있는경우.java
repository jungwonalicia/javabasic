package �迭�⺻;

import java.util.Random;

public class ó�������𸣰��ִ°�� {

	public static void main(String[] args) {
		int[] s = new int[1000];
		//new�� ram������ �����Ѵٴ� �ǹ�!
		//�迭�� �ʱⰪ���� �ڵ� �ʱ�ȭ
		//int->0
		//���߿� ���� �ִ°��
		Random	r = new Random(42);
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(100);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
