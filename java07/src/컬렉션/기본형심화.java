package �÷���;

public class �⺻����ȭ {

	public static void main(String[] args) {
		//����: byte(1����Ʈ, -128~127)->short(2����Ʈ, -+3��)
		//		->int(4����Ʈ, -+21��)->long(8)
		//�Ǽ�: float(4����Ʈ)->double(8����Ʈ)
		//����1: char
		//��: boolean
		
		byte age = 127;
		int num = 35000;
		long space = 2222222222L; //l or L
		
		double pi = 3.14567892;
		float eye = 1.5f; //f or F
		
		//�⺻�� ����ȯ
		: �ڵ�����ȯ, ��������ȯ
		byte x = 100; //1
		int y = x; //4(ū)<-1(��), �ڵ�Ÿ�Ժ�ȯ(�ڵ�����ȯ)
		
		int x2 = 100; //4
		byte y2 = (byte)x2; //1(��)<-4(ū), ����Ÿ�Ժ�ȯ(��������ȯ)
		//��������ȯ�� ��쿡�� ����ȯ�� ������ ���� ����
	}
}
