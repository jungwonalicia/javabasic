package �迭�⺻;

public class Ư���Ѱ�ã�� {

	public static void main(String[] args) {
		int[] num = {11, 44, 66, 22, 55};
		//22�� �ִ��� ���α׷� �ϼ��غ�����!
		for (int i = 0; i < num.length; i++) {
			System.out.println(i);
			if(num[i] == 22) {
				System.out.println("22�� ã��.");
				System.out.println("��ġ�� " + i);
				break;
			}
		}
	}

}
