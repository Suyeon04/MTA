package Q08;

import java.util.Scanner;
public class DataReader {
	public static void main(String[] args) {
		getBirthdate();
	}

	private static String getBirthdate() {
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	}
}
