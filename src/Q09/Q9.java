package Q09;

public class Q9 {
	public static void main(String[] args) {
		// 65��  ������̸� �ּ� ���� �ҵ��� 10,000��
		// 21�� �̻��̸� ���� �ҵ��� 25,000 �̻���
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
