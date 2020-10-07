package Exceptions;

public class CoachDoesNotExistException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CoachDoesNotExistException(String name){  
		  super("Sorry, but this type of coach does not exists");  
	}  
}
