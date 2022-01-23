package Q41;

public class Q41 {
	public static void main(String[] args) {
		countdown(10);
	}

	public static void countdown(int start) {
		for (int i = start; i >= 0;--i) {
			System.out.println(i);
		}
	}
}
