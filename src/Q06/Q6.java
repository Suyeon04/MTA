package Q06;

public class Q6 {
	public static void main(String[] args) {
		// public static void printInt() {
		if (true) {
			int num = 1;
			if (num > 0) {
				num++;
			}
		}
		int num = 1;
		addOne(num);
		num = num - 1;
		System.out.println(num);
	}
	public static void addOne(int num) {
		num = num + 1;
	}
}
