package �������̽�;

//ApplePhone class�� Phone interface�� ���� ������(implements)
public abstract class BananaPhone implements Phone {

	//Ŭ�������� ��Ģ�� �߰��ϰ� ���� ���, �߻�޼���� 
	//��Ģ�� �߰��� �� �ִ�.
	//�߻�޼���� �ҿ����ϱ� ������ �� Ŭ������ �ҿ����� Ŭ����
	//Ŭ�����̸��տ� abstract!!��� ���־�� �Ѵ�.
	//�߻�Ŭ����!
	public abstract void gps();//�߻�޼��� �߰�

	@Override
	public void call() {
		System.out.println("�ٳ��������� ��ȭ�ϴ�.");
	}

	@Override
	public void text() {
		System.out.println("�ٳ��������� �����ϴ�.");
		
	}

	@Override
	public void kakao() {
		System.out.println("�ٳ��������� ī���ϴ�.");
		
	}

	@Override
	public void internet() {
		System.out.println("�ٳ��������� ���ͳ��ϴ�.");
		
	}

	
}
