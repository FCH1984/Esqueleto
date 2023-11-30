package ar.com.codoacodo.interfaces;

public class tenerquepasaralasotrascarpetasdelpaquete {

}
package ar.com.codoacodo.interfaces;

//ESTO ES EL CONTRATO
public interface ILogger {
	//QUE
	public void log();
}


package ar.com.codoacodo.interfaces;

public class EmailLogger implements ILogger {

	//COMO
	public void log() {
		System.out.println("Enviando mail a mail@mail.com");
	}

}
}

package ar.com.codoacodo.interfaces;

public class FSLogger implements ILogger {

	//implementar el metodo log
	//polimorfismo: sobreescritura 
	public void log() {
		System.out.println("Grabando en c:/bla");
	}
}


package ar.com.codoacodo.interfaces;

public class LoggerManager {
	private String target;
	public static ILogger getLogger(String target) {
//		A > FSLogger
//		B >  EmailLogger
//		C > SMSLogger
		
		//Interface i = new ClaseQueImplementa();
		
		ILogger logger;
		switch (target) {
			case "A":
				logger = new SMSLogger();
				((SMSLogger)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLogger();
				break;
			case "C":
				logger = new EmailLogger();
				break;
			default:
				logger = null;
		}
		return logger;
	}
	
	public LoggerManager(String target) {
		this.target = target;
	}
	
	public ILogger getLogger() {
//		A > FSLogger
//		B >  EmailLogger
//		C > SMSLogger
		
		//Interface i = new ClaseQueImplementa();
		
		ILogger logger;
		switch (this.target) {
			case "A":
				logger = new SMSLogger();
				((SMSLogger)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLogger();
				break;
			case "C":
				logger = new EmailLogger();
				break;
			default:
				logger = null;
		}
		return logger;
	}
}


package ar.com.codoacodo.interfaces;

public class MainLogger {

	public static void main(String[] args) {

		String target = getTargetFromDB();
		
		LoggerManager lm = new LoggerManager(target);	
		
		ILogger logger = lm.getLogger();
		
		logger.log();
	}
	
	public static String getTargetFromDB() {
		return "C";
	}

	public static void mainV2(String[] args) {

		ILogger[] loggers = new ILogger[3];
		
		loggers[0] = LoggerManager.getLogger("A");
		loggers[1] = LoggerManager.getLogger("B");
		loggers[2] = LoggerManager.getLogger("C");
		
		for (ILogger iLogger : loggers) {
			iLogger.log();
		}
	}
}


package ar.com.codoacodo.interfaces;

public class SMSLogger implements ILogger {

	//atributos?
	private String number;
	/*
	public SMSLogger(String number) {
		this.number = number;
	}
	*/
	
	public void log() {
		System.out.println("Enviando sms al: " + getNumber());
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
}
