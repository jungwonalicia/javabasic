package ��Ʈ��ũ;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DnsToIp {

	public static void main(String[] args) {
		//
		String dns = "www.daum.nett";
		
		try {
			InetAddress ip = InetAddress.getByName(dns); //InetAddress
			System.out.println("ip�� " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(dns + "�� �ش��ϴ� ip�� ����.");
		}

	}

}
