package Q10;

public class Q10 {
	public static void main(String[] args) {

		int number = 10;

		//String text1 = '' + number;
		String text2 = "" + number;
		//String text3 = number.toString();
		String text31 = Integer.toString(number);
		
		String text4= String.valueOf(number); 
		//valueOf: ���� ���·� ��ȯ�Ҷ� ���
		// ==>Ȥ�����ڿ��� ���ڷ� ��ȯ�Ҷ�
		System.out.println(text2);
		
		System.out.println(text31);
		System.out.println(text4);
	}
}