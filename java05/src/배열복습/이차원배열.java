package �迭����;

public class �������迭 {

	public static void main(String[] args) {
		int[] one = new int[5];
		int[] two = new int[3];
		
		int[][] all = new int[2][];
		all[0] = one; //������: ��(row), ù��° ��
		all[1] = two; //�ι�° ��
		all[0][0] = 99;
		System.out.println(all[0][0]);
		
		int[][] all2 = new int[2][3];
		//�迭�� �ڵ��ʱ�ȭ, 0���� �ʱ�ȭ=> 6���� ������ �������.
		//		0	1	2	
		//0		0	0	0
		//1		0	0	0
		all2[0][0] = 99;
		all2[0][1] = 88;
		System.out.println(all2[0][0]);
		System.out.println(all2[0][1]);
		all2[0][2] = 77;
		all2[1][1] = 66;
		
		System.out.println(all2[0][2]);
		System.out.println(all2[1][1]);
		
	}

}
