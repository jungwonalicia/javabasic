package �迭�⺻;

import java.util.Random;

public class �迭�����ֱ� {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] s = new int[10000]; 
		//0,1,2: ��ġ���� 0���� ����, �ε���(index)
//		s[0] = r.nextInt(100);
//		s[1] = r.nextInt(100);
//		s[2] = r.nextInt(100);
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(100);
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
