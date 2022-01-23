package Q26;

public class Q26 {
	public static void main(String[] args) {
		
		int a1=10;
		int a2=20;
		int a3=20;
		
		int[] numbers=new int[]{a1,a2,a3};
		int[] numbers1={a1,a2,a3};
		
		int a = 5;
		int b = 10;
		int c = ++a * b--;
		System.out.println(c);
		int d = a-- + ++b;
		System.out.println(d);
	}
}
