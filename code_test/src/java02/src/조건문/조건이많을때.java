package ���ǹ�;

public class �����̸����� {

	public static void main(String[] args) {
		int jumsu = 88;
		//������ ������ �� ù���� �־��־����.(�ʱⰪ)
		//�ʱⰪ�� ���� ������, �����Ⱚ�� ����־ ����Ʈx, ����x
		//������ ������ ���� �ʱⰪ�� �� �־��־���Ѵ�.(�ʱ�ȭ)
		String result = "";
		if (jumsu >= 90) {
			result = "A����";
		}else if (jumsu >= 80) {
			result = "B����";
		}else if (jumsu >= 70) {
			result = "C����";
		}else {
			result = "D����";
		}
		
		System.out.println("����� ������ " + result);
	}

}
