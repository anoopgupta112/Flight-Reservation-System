



public class Passenger extends Address {

	
	public  int mob;
	public int id;
	
    public String name;
	public String email;
	public Contact contact;
	

	public Passenger(Contact c,int Id,String city, String Street, String state){
		super(city,Street,state);
		this.mob = c.mob;
		this.email = c.email;
		this.name = c.name;
	
		
		this.id = Id;
		
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
	
	


	
	
	
	
	

	




}

 class Contact {
	String email,name;
	int mob;
	public Contact(int mob,String email, String name) {
		this.mob = mob;
		this.email = email;
		this.name = name;
	}

}