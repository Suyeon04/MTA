package no24;

public class App1 {
	static int count;
	public static void displayMsg() {
		count++;
		System.out.println(count);
	}
 
	 public static void main(String[] args) {
		App1.displayMsg();
		App1.displayMsg();
	}
}
