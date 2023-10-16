package exception;

// chuột phải vào dấu ! chọn dòng 2
public class InvalidImageException extends Exception {
	
	private static final long serialVersionUID = -3569727925756722826L; //không gõ, click chuột phải dòng 4 kéo xuống dòng 2

	//text data
	//serialized data  mã hóa
	
	public InvalidImageException(String message) {
		super(message);
	}
}
