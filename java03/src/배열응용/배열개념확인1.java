package �迭����;

public class �迭����Ȯ��1 {

	public static void main(String[] args) {
		// 1. �迭�� ���� ��, �̹� �� ���� �˰� �ִ� ���
		// 2. �迭�� ���� ��, �� ���� �𸣴ٰ� ���߿� �ִ� ���
		int[] s = new int[3]; //{ 0, 0, 0}
		// �迭�� �ڵ��ʱ�ȭ�� ���¿��� ��� ����!
		s[0] = 100;
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
//		System.out.println(s[3]);
		System.out.println("���� ����ɱ��.");
		
		int s2; //�����Ⱚ�� �������.
		s2 = 100; //���α׷��Ӱ� ����ϰ� ���� ó������ �־��־����.
		          //�ʱⰪ�� �־��־����.(������ �ʱ�ȭ)
		System.out.println(s2);
		
		//������������ �迭�� null�� �ʱ�ȭ
		String[] s3 = new String[2]; //{null, null}
		System.out.println(s3[0]);

	}

}
