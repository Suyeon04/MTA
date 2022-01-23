package Q10;

public class Q10 {
	public static void main(String[] args) {

		int number = 10;

		//String text1 = '' + number;
		String text2 = "" + number;
		//String text3 = number.toString();
		String text31 = Integer.toString(number);
		
		String text4= String.valueOf(number); 
		//valueOf: 숫자 형태로 변환할때 사용
		// ==>혹은문자열을 숫자로 변환할때
		System.out.println(text2);
		
		System.out.println(text31);
		System.out.println(text4);
	}
}