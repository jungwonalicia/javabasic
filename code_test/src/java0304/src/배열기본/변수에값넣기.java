package �迭�⺻;

import java.util.Random;

public class ���������ֱ� {

	public static void main(String[] args) {
		//���� �־� �׽�Ʈ�� �� �ƹ����̳� �־ �׽�Ʈ
		Random r = new Random(25);//���Ѱ�(seed, �õ�)
		//System.out.println(r.nextInt());
		for (int i = 0; i < 5; i++) {
			int data = r.nextInt(100);//0~99
			System.out.println(data);
		}
		
		
	}

}
