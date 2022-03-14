package exception;

public class WrongUserException extends Exception{
	
	private static final long serialVersionUID = 7718828512143293558L;
	
	public WrongUserException() {
		super("Invalid user");
	}
}
