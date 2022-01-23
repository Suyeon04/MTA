package Q08;

import java.io.*;
public class DataReader1 {
	public static void main(String[] args) {
		getBirthdate();
	}
	private static int getBirthdate() {
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오");
		InputStream stream = System.in;
		int birthdate=0;
		try {
			birthdate = stream.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return birthdate;
	}
}
