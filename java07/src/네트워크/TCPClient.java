package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
			for (int i = 0; i < 1000; i++) {
				try {
					Socket socket = new Socket("localhost", 5000);
					System.out.println(i + "�� Ŭ���̾�Ʈ ��û��.");
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			} 
	}

}
