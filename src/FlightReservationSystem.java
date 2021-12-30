

import java.util.Scanner;

public class FlightReservationSystem {
public String name;
public int num;
public boolean showDetails;
Flight flight;
public String AvaiableFlightDetails(){

	

	Scanner sc = new Scanner(System.in);
	Flight.flightNumber = sc.nextInt();
	if(Flight.flightNumber == 132) {
		Flight.flightName = "Air India";
	}
	else if(Flight.flightNumber == 173) {
		Flight.flightName = "Hindustan";
	}
    else if(Flight.flightNumber == 322){
    	Flight.flightName = "Random";
     }

	return Flight.flightName;
	
	
	

	
	
}




}
