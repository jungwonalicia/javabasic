package �迭��ȭ;

import java.util.Random;

public class �ִ밪ã��2 {
	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		Random r = new Random(33);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000);
		}
		//1.�ִ밪�� ã�ƺ�����.
		int max = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if(max < jumsu[i]) { //true���
				max = jumsu[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
		//2.�ִ밪�� �ִ� ��ġ�� ã�ƺ�����.
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] == max) {
				System.out.println(max + "�� ��ġ�� " + i);
				count++;
			}
		}
		//3.�ִ밪�� ����ִ� ������ ī��Ʈ�غ�����.
		System.out.println("�ִ밪�� ������ " + count + "��");

	} //main�ȿ�!

}
