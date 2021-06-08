import java.util.List;

public class Person {
	private String FirstName;
	private String LastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String Phone;
	private String email;

	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String FirstName ) {
		this.FirstName = FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String LastName ) {
		this.LastName = LastName;
	}
	
	public String getAdderss() {
		return address;
	}
	
	public void setAddress(String address ) {
		this.address = address;
		
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city ) {
		this.city = city;
	}
	
	public String getstate() {
		return state;
	}
	
	public void setState(String state ) {
		this.state = state;
	}
	
	public String getZip() {
		return FirstName;
	}
	
	public void setZip(String zip ) {
		this.zip = zip;
	}
	public String getPhone() {
		return Phone;
	}
	
	public void setPhone(String Phone ) {
		this.Phone = Phone;
	}
	public String geEmail() {
		return email;
	}
	
	public void setEmail(String email ) {
		this.email = email;
	}
	

	@Override
	public String  toString() {
		return "Person{" +
				"FirstName= ' " + FirstName + '\' '+
				",LastName=' " + LastName + '\' '+
				",address' " + address + '\' '+
				",city =' " + city + '\' '+
				",state =' " + state + '\' '+
				",zip=' " + zip + '\' '+
				",Phone=' " + Phone + '\' '+
				",email=' " + email + '\' '+
	'}';

	}
	
}
