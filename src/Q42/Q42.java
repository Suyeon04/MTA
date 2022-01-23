package Q42;

public class Q42 {
	public static void main(String[] args) {
		double a= safeRoot(3.0, 2.0);
		System.out.println(a);
	}
	/*· 두 double 매개변수 radicand 및 index 수락
	· radicand가 음수이고 index가 짝수이면 null 반환
	· radicand가 음수이고 index가 홀수이면 –Math.pow(-radicand, 1 / index) 반환
	· 그렇지 않으면 Math.pow(radicand, 1 / index) 반환*/
	public static double safeRoot(double radicand, double index) {
		if (radicand >= 0) 
		{
			return Math.pow(radicand, 1 / index);
		}
		else 
		{
			if (index % 2 == 0)
			{
				return (Double) null;
			} 
			else 
			{
				return -Math.pow(-radicand, 1 / index);
			}
		}
	}
}
