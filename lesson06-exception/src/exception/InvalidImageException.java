package exception;

public class InvalidImageException extends Exception{

	private static final long serialVersionUID = -3569727925756722826L;

	// Runtime Exception(unchecked)
	// Compile Exception(checked)
	
	// class nào extends từ Exception --> Compile Exception
	// class nào extends từ RuntimeException --> RuntimeException
	public InvalidImageException(String message) {
		super(message);
	}
}
