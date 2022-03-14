package exception;

public class CrossedFunctionException extends Exception{
	
	private static final long serialVersionUID = -8718828512143293558L;
	
	public CrossedFunctionException(String message) {
		super("La función se está traslapando con "+message);
	}
}