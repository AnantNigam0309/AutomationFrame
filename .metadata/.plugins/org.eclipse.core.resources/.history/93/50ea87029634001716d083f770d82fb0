package utils;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.codehaus.jackson.map.ObjectMapper;

import exceptionsDefined.JacksonUtilityException;
import generics.constant;

public class jsonHelper extends constant{
	
	public jsonHelper(){
		log=Logger.getLogger(jsonHelper.class.getSimpleName().toString());
	}
	
	public String GET_JSON_STRING_FROM_MAP( Map<String, Object> dataMap ) throws JacksonUtilityException {
		
		if( dataMap == null || dataMap.isEmpty() ) {
			log.info( "cannot convert data from map into json when map is null/empty" );
			return new String();
		}
		Writer writer = new StringWriter();		
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue( writer, dataMap );
		} catch( Throwable t ) {
			String msg = "unable to convert data from map into json: " + dataMap.toString();
			log.warning( msg );
			throw new JacksonUtilityException( msg );
		}
		
		return writer.toString();
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, Object> GET_JSON_STRING_AS_MAP( String jsonResponse ) throws JacksonUtilityException {
	
		if( jsonResponse == null || jsonResponse.trim().isEmpty() ) {
			log.warning( "jsonResponse was null/empty, returning empty map; was: '" + jsonResponse + "'" );
			return new HashMap<String, Object>(); // don't want to return null to avoid NPEs
		}
		jsonResponse = jsonResponse.trim();
		
		Map<String, Object> result = null;		
		try {	
			ObjectMapper mapper = new ObjectMapper();
			Object o = mapper.readValue( jsonResponse, Object.class );
			if( o instanceof Map ) {
				result = (Map<String, Object>) o;
			}
		} catch( Throwable t ) {
			String msg = "unable to map json-response: " + jsonResponse; 
			log.warning(msg);
			throw new JacksonUtilityException( msg, t );
		}
		
		if( result == null ) {
			result = new LinkedHashMap<String, Object>();
		}
		return result;
	}	

}
