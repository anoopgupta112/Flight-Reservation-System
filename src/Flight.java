

public class Flight {
	
	static int flightNumber;
	public static boolean IsAvailable= true;
	static String flightName;
	private int BookedSheat;
	int passengerCounter = 3;
	public final static int Capacity = 900;

	
	public static boolean IsAvailable() {
//		Add flight number here which is available
	int[] AvailableFlightNum = {173,132,322};
	
	for(int i = 0;i<AvailableFlightNum.length;i++) {
		
	if(getFlightNum() == AvailableFlightNum[i]) {
		return IsAvailable = true;
	}}
	 
	return IsAvailable = false;
	}
	
	public Flight(String name, int num) {
		Flight.flightNumber= num;
		Flight.flightName= name;
		
		
		
	}
	Flight(){}
	
	public static int getFlightNum() {
		return flightNumber;
	}
	public void setFlightNum(int num) {
		Flight.flightNumber = num;
	}

	public int getBookedSheat() {
		return BookedSheat;
	}

	public void setBookedSheat() {
		this.BookedSheat = Capacity - passengerCounter ;
	}
}
