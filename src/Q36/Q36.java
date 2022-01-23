package Q36;

public class Q36 {
	public static void main(String[] args) {
		String a= showGreeting("hello");
		System.out.println(a);

	}
//	· String 매개변수 firstName을 수락합니다.
//	· firstName을 포함한 환영 메시지가 표시됩니다.
//	· 이름의 첫 문자가 대문자이고 남은 문자가 소문자가 되도록 합니다.
	public static String showGreeting(String firstName) {
		String welcomeMsg = "Welcome, ";
		welcomeMsg += firstName.substring(0, 1).toUpperCase() 
				+ firstName.substring(1).toLowerCase();
		return welcomeMsg;
	}
}
