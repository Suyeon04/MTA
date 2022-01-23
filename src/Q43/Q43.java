package Q43;

public class Q43 {
	public static void main(String[] args) {

		//String[] a = { "hello" };
		 String[] a = { "hello world " };
		boolean b = validateEntries(a);
		System.out.println(b);
	}

//· entries라는 String 배열을 수락
//· 항목을 반복
//· 어떤 요소라도 10 문자보다 많은 문자를 포함하면 반복을 중단하고 false를 반환
//· 그렇지 않으면 true를 반환
	public static boolean validateEntries(String[] entries) {
		boolean allValidEntries = true;
		for (String entry : entries) {
			if (entry.length() > 10) {
				allValidEntries = false;
				break;
			}
		}
		return allValidEntries;
	}
}
