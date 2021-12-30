

import java.util.Scanner;

public class FlightReservationSystem {
private String name;
private int num;
private boolean showDetails;
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
	flight = new Flight(Flight.flightName, Flight.flightNumber);
	flight = new Flight(Flight.flightName, Flight.flightNumber);
	flight = new Flight(Flight.flightName, Flight.flightNumber);
	
	
	
	

	if(Flight.IsAvailable) {
       setShowDetails(true);
		return "--------Flight is Available--------------";
	}
	else {
		Flight.flightName = null;
		Flight.flightNumber = 0;
		setShowDetails(false);
	
		return "Flight is unAvailable";
	}
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = Flight.flightName;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = Flight.flightNumber;
}
public boolean getShowDetails() {
	return showDetails;
}
public void setShowDetails(boolean showDetails) {
	this.showDetails = showDetails;
	
}



}
