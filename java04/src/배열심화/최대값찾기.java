package �迭��ȭ;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		int[] jumsu = {11, 55, 77, 22, 33};
		//�迭�� ������� �ϳ��� �̵��ϸ鼭 �ִ밪�� ã�ƾ� �Ѵ�.
		//for�� �ʿ�
		//�ε����� �÷����鼭 �� �ε����� ���� �ִ밪�� �־���� ������
		//����. ���� �迭�� �ε����� ���� �ִ밪�������� ũ�ٰ� �Ѵٸ�
		//�ε����� ���� �ִ밪 ������ ������ ��.
		int max = jumsu[0]; //11
		for (int i = 0; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
		
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] == max) {
				System.out.println("�ִ밪 ��ġ�� " + i);
			}
		}
	}

}
