package �迭�⺻;
//������ ���� ��ġ�ؾ���.
import java.util.Random;

public class �������߿���Ư���Ѱ�ã�� {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		//99�� �ִ��� ã�ƺ�����!
		//99�� �� �� �ִ��� ã�ƺ�����!
		//99�� ��� �ִ��� ã�ƺ�����!
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 99) {
				//System.out.println("99�� ã��.");
				System.out.println("99�� ��ġ: " + i);
				count++;
			}
		}
		System.out.println("������ " + count + "��");
	}
}
