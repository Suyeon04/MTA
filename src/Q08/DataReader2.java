package Q08;

import java.io.*;

public class DataReader2 {
	public static void main(String[] args) {
		getBirthdate();
	}

	private static int getBirthdate() {
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�");
		InputStream stream=System.in;
		int birthdate = 0;
		try {
			birthdate = stream.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return birthdate;
	}

}
