package Q20;

public class Q20 {
	public static void main(String[] args)
	{
	String firstName = "Christopher";
	firstName = firstName.substring(0,5); 
	String output = String.format("%s is %d chracters long", 
			firstName, firstName.length());
	System.out.println(output);
	}

}
