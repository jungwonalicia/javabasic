package �迭�⺻;

public class �迭Ȯ�ι��� {

	public static void main(String[] args) {
		// 5���� int������ �迭�� ����, 100~104���� �־
		// ��ü ����Ʈ
		int[] s = new int[5];//{100, 101, 102, 103, 104}
		for (int i = 0; i < s.length; i++) {
			s[i] = 100 + i;
		//  s[0] = 100 + 0;
		//  s[1] = 100 + 1;
		//  s[2] = 100 + 2;
		//  s[3] = 100 + 3;
		//  s[4] = 100 + 4;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ": " + s[i]);
		}
		
		

	}

}
