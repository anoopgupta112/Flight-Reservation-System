

public class Ticket {
	


		
		public int PNR_Number, sheatNumber, FlightNumber;
		public static int sheatCounter;
		public float price;
		String departure, destination,FlightName,date,time;
	
		
	
		
		

		public Ticket ( int PNR,int sheatNum, String departure, String destination, float price, String date, String time){
			this.FlightName = Flight.flightName;
			this.FlightNumber = Flight.flightNumber;
			
			this.departure = departure;
			this.destination = destination;
			
			this.PNR_Number = PNR;
			this.sheatNumber = sheatNum;
			this.price = price;
			this.date = date;
			this.time = time;
			
		}


	
	
	    
//		TouristTicketInfo---------------------------------
	   public  void TouristTicketInfo()
	{
		
	
	


		CommonInfo();

	}
	//RegularTicketInfo---------------------------------
	public void RegularTicketInfo() {
		RegularTicket RT = new RegularTicket(true, true, false);
		System.out.println("Has the Passenger Ordered: "+ RT.Food);
		System.out.println("Has the passenger ordered Snacks: "+ RT.Snacks);
		System.out.println("Has the passenger ordered Water: "+RT.Water);
		

	
	   CommonInfo();
	}


	private	void CommonInfo() {
		
			System.out.println("FlightNumber :  "+FlightNumber);
			System.out.println("FlightName:  "+FlightName);

		    
		
		    System.out.println("There are  "+sheatCounter +" Passenger in flight");
		 
			System.out.println("this is PNR no.: " +PNR_Number);
			System.out.println("this is sheat no.:  " +sheatNumber);

			System.out.println("Flight no.: "+FlightNumber);
			System.out.println("price: " + price);
			System.out.println("departure location " +departure);

			System.out.println("destination: " + destination);
		


			
		}

	
		
//		TouristTicket-----------------------------------------
	public class TouristTicket extends Address{
	//Add Hotel Address-----------------
	public TouristTicket(String city, String Street, String state) {
			super(city, Street, state);
			
		}

		public void UpdateTouristLocation(String city, String Street, String state) {
			this.city = city;
			this.Street = Street;
			this.state = state;
		}	
		
		
		
	}	
	//RegularTicket-------------------------------
	public class RegularTicket{
		private boolean Food;
		private boolean Snacks;
		private boolean Water;
		public boolean Tea;
		public boolean Coffee;
		
		public RegularTicket(boolean Food, boolean Snacks, boolean Water) {
	       this.Food = Food;
	       this.Snacks = Snacks;
	       this.Water = Water;
		}
		
	    public void AvailableServices(boolean Tea, boolean Coffee) {
			this.Tea = Tea;
			this.Coffee = Coffee;
		}
	}
	}



