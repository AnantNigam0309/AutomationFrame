package exceptionsDefined;

import java.util.logging.Logger;

public class JacksonUtilityException extends Throwable {

	protected static final Logger LOGGER = Logger.getAnonymousLogger();
	
	private static final long serialVersionUID = 1L;

	public JacksonUtilityException( String message ) {
		super( message );
	}
	
	public JacksonUtilityException( String message, Throwable cause ) {
		super( message, cause );
	}
	
}