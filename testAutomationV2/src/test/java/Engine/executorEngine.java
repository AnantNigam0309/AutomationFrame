package Engine;

import java.io.UnsupportedEncodingException;

import apiary.Firebase;
import exceptionsDefined.FirebaseException;

public class executorEngine {

	public static void main(String[] args) throws FirebaseException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
      //https://www.shawacademy.com/courses/photography?r=e
		Firebase fb=new Firebase("https://www.shawacademy.com/courses?r=e");
	
		System.out.println(fb.get());
	}

}
