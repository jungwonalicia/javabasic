package ���ǹ�;

import java.util.Scanner;

public class �⺻�Է��ܼ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� >> ");
		String data = sc.next();
		System.out.println("�̸��� " + data);
		
		System.out.print("���� �Է� >> ");
		int data2= sc.nextInt(); //String->int
		System.out.println("���⳪�̴� " + (data2 + 1));

	}

}
