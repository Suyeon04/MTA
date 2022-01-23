package Q29;

import java.util.ArrayList;

public class Q29 {
	public static void main(String[] args) {
		ArrayList<String> in = new ArrayList<String>();
		in.add("a");
		in.add("b");
		in.add("c");
		for (String in1 : in) {
			System.out.println(in1);
		}
		Process(in);
	}

	public static void Process(ArrayList<String> invoices) {
		for (int i = 0; i < invoices.size(); i = i + 1) {
			String invoice = invoices.get(i);
			// TODO: 没备辑 贸府
			invoices.remove(i);
			System.out.println(invoices);
		}
	}
}







