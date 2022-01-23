package Q37;

public class Q37 {
	public static void main(String[] args) {
		int timer = 60;

		while (timer >= 0) {
			if (timer == 0)
				break;
			else {
				System.out.println("타이머가 카운트 다운 중입니다..." + timer);
				timer--;
			}
		}

	}
}
