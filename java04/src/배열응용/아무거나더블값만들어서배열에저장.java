package �迭����;

import java.util.Random;

public class �ƹ��ų����������迭������ {

	public static void main(String[] args) {
		// double�� �ƹ��ų� ���� �迭�� 50�� ���� ��, ����Ʈ
		double[] num2 = new double[50];//{}
		Random	r = new Random();
		for (int i = 0; i < num2.length; i++) {
			num2[i] = r.nextDouble();
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println(i + ": "  + num2[i]);
		}

	}

}
