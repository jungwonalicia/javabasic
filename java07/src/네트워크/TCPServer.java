package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//���ο� ����
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("���� ���۵�. Ŭ���̾�Ʈ�� ��û�� ��ٸ�.");
			while (true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� ��û�� ���ε�.");
			}
			//������ ���ۿ� ����
		} catch (Exception e) {
			System.out.println("���� ��� �� ���� �߻�");
			e.printStackTrace();
		}
		
	}

}
