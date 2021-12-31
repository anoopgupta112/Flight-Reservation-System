

public class Ticket{
	
	private int  sheatNumber, FlightNumber;
	private static int sheatCounter;
	private float price;
	String departure, destination,FlightName,date,time;
	//aggregation
	
	Passenger passenger;
	
	

	public Ticket (Flight flight,int sheatNum, String departure, String destination, float price, String date, String time){
		this.FlightName = Flight.flightName;
		this.FlightNumber = Flight.flightNumber;
		
		this.departure = departure;
		this.destination = destination;
		
		
		this.sheatNumber = sheatNum;
		this.price = price;
		this.date = date;
		this.time = time;
		
	}

	
	
	
//	TouristTicketInfo---------------------------------
   public  void TouristTicketInfo()
      {
	TouristTicket tt = new TouristTicket("Delhi", "karolbaag", "Delhi",4324436432L);
	System.out.println("City for Tourist: "+tt.city);
	System.out.println("State for Tourist: "+tt.state);
	
	System.out.println("Street for Tourist: "+tt.Street);
	System.out.println("this is PNR no. for Tourist Ticket : " +tt.PNR);
//	tt.UpdateTouristLocation("usa","California","usa");
     CommonInfo();

}
   
   
//RegularTicketInfo---------------------------------
    public void RegularTicketInfo() {
	RegularTicket RT = new RegularTicket(true, true, false, 8324243253L);
	System.out.println("Has the Passenger Ordered: "+ RT.Food);
	System.out.println("Has the passenger ordered Snacks: "+ RT.Snacks);
	System.out.println("Has the passenger ordered Water: "+RT.Water);
	System.out.println("this is PNR no. for Regular Ticket :  " +RT.PNR);
	
//	user also can order ------TEA and COFFEE
	RT.AvailableServices(false, false);
    CommonInfo();
}
   //	for already register user try this email - defaultuser@gmail.com or defaultuser2@gmail.com

   //  number, email and name
  	
  	Passenger.Contact c1 = new Passenger.Contact(1234567890L,"anoopgupta671@gmail.com","anoop");
    Passenger.Contact c2 = new Passenger.Contact(1234567890L,"defaultuser@gmail.com","rohit");
      
     
    //Contact, Id, Idcounter, city, state, street
    
	Passenger p1 = new Passenger(c1, 230,+1,"Lucknow","kapurthala","UP");
	Passenger p2 = new Passenger(c2, 231,+2,"Delhi","karolbag","Delhi");
	Passenger p3 = new Passenger(c2, 231,+3,"Gorakhpur","Golghar","UP");  

        private	void CommonInfo() {
	
		System.out.println("FlightNumber :  "+FlightNumber);
		System.out.println("FlightName:  "+FlightName);

	    System.out.println("User is already register: "+p1.checkPassenger());
	    sheatCounter = Passenger.getPassengerCount();
	    System.out.println("There are  "+sheatCounter +" Passenger in flight");
	 
	
		System.out.println("this is sheat no.:  " +sheatNumber);

		System.out.println("Flight no.: "+FlightNumber);
		System.out.println("price: " + price);
		System.out.println("departure location " +departure);

		System.out.println("destination: " + destination);
		System.out.println("Ticket Cancelled Status : " + checkTicketCancelled());
        PassengerDetail(); 


		
	}
        

     
        public void PassengerDetail() {
		System.out.println();
		System.out.println("-------------------passenger Details------------------- " );
		System.out.println("passenger name: " + p1.name);
		System.out.println("passenger Id: " + p1.id);
		System.out.println("Contact number : " + c1.mob);
		System.out.println("Contact email : " + c1.email);
		System.out.println("Passenger Street: "+ p1.Street);
		System.out.println("Passenger State: "+ p1.state);
		System.out.println("Passenger city : "+ p1.city);

	}
	
	//check cancelled the ticket or not-------------
	public boolean checkTicketCancelled() {
		if(p1.name == "rahul") {
			return true;
		}
		return false;
	}
	
//	TouristTicket-----------------------------------------
    public class TouristTicket extends Address{
//Add Hotel Address-----------------
	 Long PNR;
    public TouristTicket(String city, String Street, String state,Long PNR) {
		super(city, Street, state);
		this.PNR = PNR;
		
	}

	public void UpdateTouristLocation(String city, String Street, String state) {
		this.city = city;
		this.Street = Street;
		this.state = state;
	}	
	
	
	
}	
//RegularTicket-------------------------------
    public class RegularTicket{
	 Long PNR;
	private boolean Food;
	private boolean Snacks;
	private boolean Water;
	public boolean Tea;
	public boolean Coffee;
	
	public RegularTicket(boolean Food, boolean Snacks, boolean Water,Long PNR) {
       this.Food = Food;
       this.Snacks = Snacks;
       this.Water = Water;
       this.PNR = PNR;
	}
	
    public void AvailableServices(boolean Tea, boolean Coffee) {
		this.Tea = Tea;
		this.Coffee = Coffee;
	}
}
}

