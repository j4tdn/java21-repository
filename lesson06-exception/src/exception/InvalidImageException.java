package exception;

public class InvalidImageException extends Exception{
	
	private static final long serialVersionUID = -3569727925756722826L;

	// text data
	// serialized data
	
	public InvalidImageException(String message) {
		super(message);
	}
}
