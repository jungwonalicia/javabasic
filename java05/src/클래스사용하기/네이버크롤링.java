package Ŭ��������ϱ�;

import java.io.IOException;

import org.jsoup.Jsoup;

public class ���̹�ũ�Ѹ� {

	public static void main(String[] args) throws IOException {
		// ���̹� ũ�Ѹ��� �غ���.
		System.out.println(Jsoup.connect("http://www.naver.com").get());
	}

}
