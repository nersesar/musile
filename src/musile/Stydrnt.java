package musile;

public class Stydrnt {  // Our class name is "Stydrnt" .  
	int phone_number;   
	int age;
	int Bank_accout;   // We declare the characteristics for our class 
	int curensy;
	String name;
	String lastname;
	
	
	public int getPhone_number() {    // Here we generate getters and setters for
	                                  // security. Although we call is methods (functions).
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getBank_accout() {
		return Bank_accout;
	}
	public void setBank_accout(int bank_accout) {
		Bank_accout = bank_accout;
	}
	public int getCurensy() {
		return curensy;
	}
	public void setCurensy(int curensy) {
		this.curensy = curensy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;

	

}}