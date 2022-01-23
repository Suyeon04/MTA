package Q40;

public class Q40 {
	public static void main(String[] args) {
		double discount;
		int age = 0;
		if (age >= 25) {
			discount = 0.50;
		} else if (age >= 21) {
			discount = 0.25;
		} else {
			discount = 0.0;
		}

		switch (age) {
		case 25:	discount = 0.50;	break;
		case 24:	case 23:	case 22:
		case 21:	discount = 0.25;	break;
		default:
			discount = 0.0;
		}
		
		
		String grade = "";
		String message = "";

		if (grade == "A") {
			message = "표준 초과";
		} else if (grade == "B") {
			message = "표준 충족";
		} else {
			message = "개선 필요";
		}

		switch (grade) {
		case "A":	message = "표준초과";	break;
		case "B":	message = "표준충족";	break;
		default:	message = "개선필요";
		}
		
		double gpa = 0.0;
		int priority = 0;
		if (gpa == 4.0) {
			priority = 1;
		} else if (gpa == 3.0) {
			priority = 2;
		} else if (gpa >= 2.5) {
			priority = 3;
		}
//		switch (gpa){ double형은 case에서 사용할 수 없음 
//			case 4.0 :priority=1;break;
//			case 3.0 :priority=2;break;
//			case 2.5 :priority=3;break;
//			
//		}

	}

}
