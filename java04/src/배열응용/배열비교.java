package �迭����;

public class �迭�� {

	public static void main(String[] args) {
		int[] n1 = {1, 2, 3};
		int[] n2 = {1, 5, 3};
		int count = 0;
		for (int i = 0; i < n2.length; i++) {
			if(n1[i] == n2[i]) {
				System.out.println(i + "��° ���� ������.");
				count++; //����������, 1�� ����
				//count = count + 1;
			}
		}
		System.out.println("�� ������ ������ " + count + "��");
		
		

	}

}
