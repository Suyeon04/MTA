package Q31;

public class Q31 {
	public static void main(String[] args) {

		convertStringToNumber("100");
	}

	public static void convertStringToNumber(String numberAsString)
		{
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
		}
}
