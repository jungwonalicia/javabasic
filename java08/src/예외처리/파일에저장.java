package ����ó��;

import java.io.FileWriter;
import java.io.IOException;

public class ���Ͽ����� {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("���� ù��" + "\n");
			file.write("���� ��°��" + "\n");
			file.write("���� ��°��" + "\n");
			file.close(); //stream�� �ݾƾ� �Ѵ�.
			System.out.println(3/0);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("���Ͽ� �����ϴ� �� ������ �߻���.");
		} catch (ArithmeticException e2) {
			System.out.println("0���� ����� �����߻��ߴµ� ���� ó����.");
		} catch (Exception e) {
			System.out.println("������ ���� ���� ��� ����ó���� ���� �� ó����.");
		} finally { //���ܹ߻����ο� ������� ������ �����ϴ� �κ�!
			System.out.println("��~~����ó�� �� ����.");
		}

	}

}
