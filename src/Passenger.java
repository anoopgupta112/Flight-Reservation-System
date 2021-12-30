

public class Passenger{

	
	public  int mob;
	public int id;
	private static int idCounter;
    public String name;
	public String email,city, state, street;
	public Contact contact;
	
Address a = new Address("Lucknow", "alambag", "UP");
	public Passenger(Contact contact,int Id,int idCounter,String city, String state, String street){
		this.city = a.city;
		this.state = a.state;
		this.street = a.Street;
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
		for(int i = 0;i <emails.length ; i++) {
	
		if(email.equals(emails[i])) {
			return true;
	
		}

		}
		return false;
		
	}
	
	

//	nested class Contact
      static class Contact {
		String email,name;
		int mob;
		public Contact(int mob, String email, String name) {
			this.mob = mob;
			this.email = email;
			this.name = name;
		}

	}
	
	
	
	
	

	




}