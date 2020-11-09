package throwCustomClassException;

public class AgeInvalidException extends Exception {

	public AgeInvalidException(String msg)
	{
		super(msg);
	}
}
