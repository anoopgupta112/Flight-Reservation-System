

public class Main {
	public static void main(String[] args) {
		
//		flightName, flightNum
		
		
		System.out.println("Enter Flight Number here (Try-173,132 or 322) : ");
		FlightReservationSystem checkFlight =new  FlightReservationSystem();
		Flight flightDetails = new Flight(checkFlight.getName(), checkFlight.getNum());
		
		System.out.println(checkFlight.AvaiableFlightDetails());
		
		if(checkFlight.getShowDetails()) {
			 //flightDetails, PNR, sheatNum, FlightNum, departure, destination, price
			Ticket ticket = new Ticket(flightDetails,1234567890, 32, "Delhi", "Lucknow", 3000,"31/12/2021","12:30 pm");
			ticket.RegularTicketInfo();
			
		}

		
		
		

		
		
	
	}

	

}
