package �迭��ȭ;

public class �����������ּҰ�ã�� {

	public static void main(String[] args) {
		int[] num = {90, 80, 20, 60, 70};
		
		//�ش� index������ �ּҰ��� �־�δ� ������ �ϳ� ������.
		int min = num[0];//90
		//0���� �ʱⰪ�� �־��ָ�, �ּҰ��� 0�� �Ǿ������.!
		for (int i = 1; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
		
		
		

	}

}
