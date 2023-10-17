package exception;

public class InvalidImageException extends Exception {

	private static final long serialVersionUID = -1540926818582737199L;
	
	// text data
	// serialized data
	
	public InvalidImageException(String message) {
		super(message);
	}
}
