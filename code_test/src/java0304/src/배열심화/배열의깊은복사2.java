package �迭��ȭ;

public class �迭�Ǳ�������2 {

	public static void main(String[] args) {
		String[] ����� = { "����", "����", "����", "��ǻ��", "ȸȭ" };
		int[] �б�1���� = { 44, 66, 22, 99, 100 };
		int[] �б�2���� = �б�1����.clone();
		�б�2����[0] = 22;
		�б�2����[2] = 88;

//		0)��ü 1�б�, 2�б� ���� ����Ʈ
		for (int i = 0; i < �б�1����.length; i++) {
			System.out.print(�б�1����[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < �б�2����.length; i++) {
			System.out.print(�б�2����[i] + " ");
		}
		System.out.println();
		
//		1)1�б�, 2�б� ���� �� ������ ���������
		int count = 0;
		for (int i = 0; i < �б�2����.length; i++) {
			if(�б�1����[i] == �б�2����[i]) {
				count++;
			}
		}
		System.out.println("���ϰ����: " + count + "��");
		
//		2)1�б�, 2�б� ���� �� ���� �����
		int count2 = 0;
		int index = 0; //2
		for (int i = 0; i < �б�2����.length; i++) {
			if(�б�1����[i] < �б�2����[i]) {
				count2++;
				index = i; //2
			}
		}
		System.out.println("���������: " + count2 + "��");
		
//		3)1�б�, 2�б� ���� �� ���� �����
		System.out.println("���������: " + �����[index]);

	}

}
