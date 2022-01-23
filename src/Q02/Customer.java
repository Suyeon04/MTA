package Q02;

public class Customer {
	private int id = 3;
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.id = 5;
		
		// id=5 ==> customer.을 추가해야 합니다.
		customer.showId();
		// showId()메서드호출 추가
	}

	protected void showId() {// 변경하지 않아도 됨
		System.out.println(id);
	}
}
