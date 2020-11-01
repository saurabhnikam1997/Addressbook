package addressBook;
import java.util.Scanner;


public class Person {
	Scanner sc = new Scanner(System.in);
	
		String firstName;
		private String lastName;
		private String city;
		private String state;
		String phoneNumber;
		String zip;
		
		public Person() {
			firstName = "";
			lastName = "";
			city = "";
			state = "";
			phoneNumber = "";
			zip = "";
		}
		
		//constructor
		public Person(String firstNmae, String lastName, String city, String state, String phoneNumber, String zip, String firstName) {
			this.firstName = firstName;
			this.lastName = lastName;			
			this.city = city;
			this.state = state;
			this.phoneNumber = phoneNumber;
			this.zip = zip;
		}
		
		public String toString() {
			return "Name:"+firstName+ " " +lastName+ ", City:" + city + ",  Phone:" + phoneNumber + ", State:" + state +", Zip:" + zip;
		}

		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setlastName(String lastName) {
			this.lastName = lastName; 
		}
	
		public void setcity(String city) {
			this.city = city;
		}
		
		public void setstate(String state) {
			this.state = state;
		}
		
		public void setphoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void setzip(String zip) {
			this.zip = zip;
		}
		
		//getters
		public String getfirstName() {
			return firstName;
		}
		
		public String getlastName() {
			return lastName;
		}
		
		public String getcity() {
			return city;
		}
		
		public String getstate() {
			return state;
		}
		
		public String getphoneNumber() {
			return phoneNumber;
		}
		
		public String getzip() {
			return zip;
		}

		
		
}


