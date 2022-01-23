package Q09;

public class Q9 {
	public static void main(String[] args) {
		// 65세  고령자이며 최소 연간 소득이 10,000임
		// 21세 이상이며 연간 소득이 25,000 이상임
		// > && >= || == != <= = <
		int age = 0;
		int income = 0;

		if (((age > 65) && (income >= 10000)) || ((age >= 21) && (income > 25000))) {
			System.out.println("Approved");
		} else {
			System.out.println("Declined");
		}
	}
}
