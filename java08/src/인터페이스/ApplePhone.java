package �������̽�;

//ApplePhone class�� Phone interface�� ���� ������(implements)
public class ApplePhone implements Phone {

	//�Ϲ� �޼���
	@Override
	public void internet() {
		System.out.println("���������� ���ͳ��ϴ�.");
	}

	@Override
	public void call() {
		System.out.println("���������� ��ȭ�ϴ�.");

	}

	@Override
	public void text() {
		System.out.println("���������� �����ϴ�");

	}

	@Override
	public void kakao() {
		System.out.println("���������� ī���ϴ�.");
	}
}
