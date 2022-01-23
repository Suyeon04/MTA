package Q11;

import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner("1 탁월 2 우수 3 양호 4 불량");
		Object data1 = sc.next();
		Object data2 = sc.next();
		Object data3 = sc.nextInt();
		Object data4 = sc.nextLine();
		System.out.println("답1 " + data1);
		System.out.println("답2 " + data2);
		System.out.println("답3 " + data3);
		System.out.println("답4 " + data4);
	}
}
