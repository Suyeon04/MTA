package Q15;

class Logger {
	protected void logError(String message)
	  {    }
}

// ���� ��Ű������ �ٸ� Ŭ��������  logError �޼ҵ� ȣ���ϴ� ���
class LoggerTest {
	 LoggerTest(){
	 Logger loggerTest=new Logger();
	 loggerTest.logError("aa");
	}
}
// Logger Ŭ������ ���� ��ӹ��� Ŭ�������� logError �޼ҵ� ȣ���ϴ� ���
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

//��Ŀ Ŭ����(only)�� ��Ŀ Ŭ���� �� ���� ��ӹ޾��� ���� ��Ű���� Ŭ������
// ����� ���� ����, by all classes in all packages->same packages �� �Ǿ����.
