package chainOfRes;

public class Test {
	  public static void main(String[] args) {
	      AbstractLogger loggerChain = ChainPatternDemo.getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	   }

}
