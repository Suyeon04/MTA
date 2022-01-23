package Q02;

/*class Sample{
	public int a;
	private int b;
	int c;
}*/

public class AccessEx {
	public static int a;
	private int b;
	int c;
	public static void main(String[] args) {
		AccessEx aClass=new AccessEx();
		a=10;
		aClass.b=10;
		aClass.c=10;
	}

}
