package �迭�⺻;

public class �迭����3 {

	public static void main(String[] args) {
		int[] s = new int[1000];
		//���� ������ �ݺ������� ������ �̵��ϸ鼭 
		//������ �ְ��� �ϴ� ��� �迭����ϸ� ����.
		for (int i = 0; i < s.length; i++) {
			s[i] = i + 1;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ": " + s[i]);
		}

	}

}
