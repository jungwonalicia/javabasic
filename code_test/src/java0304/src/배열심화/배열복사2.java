package �迭��ȭ;

public class �迭����2 {

	public static void main(String[] args) {
		// ������(�ּ�)
		int[] num = {100, 200, 300};
		//int[] num2 = num; //���� ����
		int[] num2 = num.clone();//���� ����
		
		System.out.println("num�ּ�>> " + num);
		System.out.println("num2�ּ�>> " + num2);
		
		System.out.print("num>>  ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.print("num2>> ");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println();
		
		num[0] = 999;
		System.out.print("������ num>>  ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.print("������ num2>> ");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println();

	}

}
