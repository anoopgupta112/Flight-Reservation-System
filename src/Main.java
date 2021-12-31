

public class Main {
	public static void main(String[] args) {
	
		System.out.println("Enter Flight Number here (Try-173,132 or 322) : ");
		FlightReservationSystem checkFlight =new  FlightReservationSystem();
//		flightName, flightNum
		Flight flightDetails = new Flight(checkFlight.getName(), checkFlight.getNum());
		
		System.out.println(checkFlight.AvaiableFlightDetails());
		
		if(checkFlight.getShowDetails()) {
			 //flightDetails, PNR, sheatNum, FlightNum, departure, destination, price
			
			Ticket ticket = new Ticket(flightDetails, 32, "Delhi", "Lucknow", 3000,"31/12/2021","12:30 pm");
		    System.out.println("///////////////////////--- Regular Ticket ---- //////////////////////////");
			ticket.RegularTicketInfo();
            System.out.println();
            System.out.println("//////////////////////-- Tourist Ticket --//////////////////////////");
            
			ticket.TouristTicketInfo();
			
		}

	}


}
