package �迭��ȭ;

import java.util.Arrays;

public class �������������� {

	public static void main(String[] args) {
		int[] num = {100, 77, 22, 55, 66};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("�ִ밪�� " + num[num.length - 1]);
	}

}
