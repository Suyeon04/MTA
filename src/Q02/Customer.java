package Q02;

public class Customer {
	private int id = 3;
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.id = 5;
		
		// id=5 ==> customer.�� �߰��ؾ� �մϴ�.
		customer.showId();
		// showId()�޼���ȣ�� �߰�
	}

	protected void showId() {// �������� �ʾƵ� ��
		System.out.println(id);
	}
}
