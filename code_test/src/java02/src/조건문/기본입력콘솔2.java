package ���ǹ�;

import java.util.Scanner;

public class �⺻�Է��ܼ�2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� >> ");
		String data = sc.next(); //�Ѵܾ�
		System.out.print("Ű �Է� >> ");
		double height = sc.nextDouble();
		System.out.print("������ �Է� >> ");
		double weight = sc.nextDouble();
		System.out.print("������ �Ծ��� >> ");
		boolean food = sc.nextBoolean();
		System.out.print("���� �¿���� >> ");
		sc.nextLine();//����ó��
		String life = sc.nextLine();
		
		
		System.out.println("�̸��� " + data);
		System.out.println("���� Ű�� " + (height + 10));
		System.out.println("���� �����Դ� " + (weight - 10));
		System.out.println("������ �Ծ����� " + food);
		System.out.println("�� �¿���� " + life);
		
		

	}

}
