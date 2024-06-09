package demo;

import java.util.Objects;

public class Person2 {
	private String firstName;
	private String lastName;
	private long aadhaarId;
	
	public Person2(String firstName, String lastName, long aadhaarId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadhaarId = aadhaarId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(long aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return "Person[firstName=" + firstName + ", lastName="+lastName+", aadhaarId="+ aadhaarId+"]";
	}
	

}
