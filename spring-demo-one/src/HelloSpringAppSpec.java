
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.excercises.springdemo.HelloSpringApp;

import Exceptions.CoachDoesNotExistException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;

class HelloSpringAppSpec {

	HelloSpringApp helloSpringApp = new HelloSpringApp();
		
	@Test
	void BaseballCoachtest() {
		assertEquals("Play baseball" ,HelloSpringApp.callingCoach("BaseballCoach"), "BasballCoach works");
	}
	
	@Test
	void TennisCoachtest() {
		assertEquals("Do something with tennis (sports aren't really my thing, sorry)" ,HelloSpringApp.callingCoach("TennisCoach"), "TennisCoach works");
	}
	
	@Test
	void TrackCoachtest() {
		assertEquals("Do a running", HelloSpringApp.callingCoach("TrackCoach"), "TrackCoach works");
	}
	
	@Test
	void ShouldReturnErrorWithNonExistingCoachName() {		
		 try {
		 	HelloSpringApp.callingCoach("null");
	    } catch (CoachDoesNotExistException e) {		       
	    	assertEquals("Sorry, but this type of coach does not exists", e.getMessage(), "CoachDoesNotExistException works");
		}
	}

}
