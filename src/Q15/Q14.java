package Q15;

class Logger {
	protected void logError(String message)
	  {    }
}

// 같은 패키지내에 다른 클래스에서  logError 메소드 호출하는 방법
class LoggerTest {
	 LoggerTest(){
	 Logger loggerTest=new Logger();
	 loggerTest.logError("aa");
	}
}
// Logger 클래스로 부터 상속받은 클래스에서 logError 메소들 호출하는 방법
class LoggerB extends Logger {
	public void logError(String message)
	  {
		  super.logError(message);
	  }
}

public class  Q14 {
	public static void main(String[] args) {
		Logger test=new Logger();
		test.logError("aa");
   }
	
}
















class LoggerD {
	LoggerD() {
		Logger d=new Logger();
		d.logError("aa");
	}
}

/*class LoggerE {
	Logger e=new Logger();
	e.logError("cc");
}*/

//로커 클래스(only)와 로커 클래스 로 부터 상속받아진 같은 패키지의 클래스들
// 영어로 문장 보면, by all classes in all packages->same packages 가 되어야지.
