package Q43;

public class Q43 {
	public static void main(String[] args) {

		//String[] a = { "hello" };
		 String[] a = { "hello world " };
		boolean b = validateEntries(a);
		System.out.println(b);
	}

//�� entries��� String �迭�� ����
//�� �׸��� �ݺ�
//�� � ��Ҷ� 10 ���ں��� ���� ���ڸ� �����ϸ� �ݺ��� �ߴ��ϰ� false�� ��ȯ
//�� �׷��� ������ true�� ��ȯ
	public static boolean validateEntries(String[] entries) {
		boolean allValidEntries = true;
		for (String entry : entries) {
			if (entry.length() > 10) {
				allValidEntries = false;
				break;
			}
		}
		return allValidEntries;
	}
}
