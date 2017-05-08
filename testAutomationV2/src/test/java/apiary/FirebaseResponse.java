package apiary;

import java.util.LinkedHashMap;
import java.util.Map;

import generics.constant;

public class FirebaseResponse extends constant{

	private final boolean success;
	private final int code;
	private final Map<String, Object> body;
	private final String rawBody;
	
	public FirebaseResponse( boolean success, int code, Map<String, Object> body, String rawBody ) {
		
		this.success = success;
		this.code = code;
		
		if( body == null ) {
			log.info( "body was null; replacing with empty map" );
			body = new LinkedHashMap<String, Object>();
		}
		this.body = body;
		
		if( rawBody == null ) {
			log.info( "rawBody was null; replacing with empty string" );
			rawBody = new String();
		}
		this.rawBody = rawBody.trim();
	}
	
	public boolean getSuccess() {
		return this.success;
	}

	public int getCode() {
		return this.code;
	}

	public Map<String, Object> getBody() {
		return this.body;
	}

	public String getRawBody() {
		return this.rawBody;
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		result.append( FirebaseResponse.class.getSimpleName() + "[ " )
				.append( "(Success:" ).append( this.success ).append( ") " )
				.append( "(Code:" ).append( this.code ).append( ") " )
				.append( "(Body:" ).append( this.body ).append( ") " )
				.append( "(Raw-body:" ).append( this.rawBody ).append( ") " )
				.append( "]" );
		
		return result.toString();
	}

}
