package Q36;

public class Q36 {
	public static void main(String[] args) {
		String a= showGreeting("hello");
		System.out.println(a);

	}
//	�� String �Ű����� firstName�� �����մϴ�.
//	�� firstName�� ������ ȯ�� �޽����� ǥ�õ˴ϴ�.
//	�� �̸��� ù ���ڰ� �빮���̰� ���� ���ڰ� �ҹ��ڰ� �ǵ��� �մϴ�.
	public static String showGreeting(String firstName) {
		String welcomeMsg = "Welcome, ";
		welcomeMsg += firstName.substring(0, 1).toUpperCase() 
				+ firstName.substring(1).toLowerCase();
		return welcomeMsg;
	}
}
