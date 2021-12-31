

 class Passenger extends Address {

	
	public  Long mob;
	public int id;
	private static int idCounter;
    public String name;
	public String email;
	public Contact contact;
	

	public Passenger(Contact contact,int Id,int idCounter,String city, String Street, String state){
		super(city,Street,state);
		this.mob = contact.mob;
		this.email = contact.email;
		this.name = contact.name;
		Passenger.idCounter = idCounter;
		
		this.id = Id;
		
	}
	
	public static int getPassengerCount(){
		
		return idCounter;
	}
	public boolean checkPassenger() {
//	     we can also use arraylist here and use -> .add() for new user
		String[] emails = {"defaultuser@gmail.com","defaultuser2@gmail.com","defaultuser3@gmail.com" };
		for(int i = 0;i <emails.length -1; i++) {
	
		if(email.equals(emails[i])) {
			return true;
	
		}

		}
		return false;
		
	}
	
	

//	nested class Contact
static class Contact {
		public String email,name;
		public Long mob;
		public Contact(Long mob, String email, String name) {
			this.mob = mob;
			this.email = email;
			this.name = name;
		}

	}
	
	
	
	
	

	




}