package addressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class AddressBookImplement implements AddressBookInterface  {
	
	public static ArrayList<Person> personInfo = new ArrayList<Person>();
	Scanner sc = new Scanner(System.in);
	private Scanner sc2;

	@Override
	public void addPerson() {
		System.out.println("Enter the firstName: ");
		String firstName = sc.nextLine();
		System.out.println("Enter the lastName: ");
		String lastName = sc.nextLine();
		System.out.println("Enter the city: ");
		String city = sc.nextLine();
		System.out.println("Enter the state: ");
		String state = sc.nextLine();
		System.out.println("Enter the PhoneNumber: ");
		String phoneNumber = sc.nextLine();
		System.out.println("Enter the Zip: ");
		String zip = sc.nextLine();
		Person person = new Person(firstName, lastName, city, state, phoneNumber, zip, zip);
		personInfo.add(person);
	}

	@Override
	public void editPerson() {
		int cond=1;
		System.out.println("Enter FirstName to update details");
		String name = sc.nextLine();
		
		for (Person person : personInfo) {
			if (name.equals(person.firstName)) {
				while (cond == 1) {
					System.out.println("Select an Option to update:\n"
						+ "1. phoneNumber\n"
						+ "2. Address\n"
						+ "3. Quite");
				int numb = sc.nextInt();
				sc2 = new Scanner(System.in);
				switch (numb) {
				case 1:
					System.out.println("Enter New Value:");
					String phoneNumber = sc2.nextLine();
					person.setphoneNumber(phoneNumber);
					break;
					
				case 2:
					System.out.println("Enter New city:");
					String city = sc2.nextLine();
					person.setcity(city);
					
					System.out.println("Enter New state:");
					String state = sc2.nextLine();
					person.setstate(state);
					
					System.out.println("Enter New zipCode:");
					String zip = sc2.nextLine();
					person.setzip(zip);
					break;
					
				case 3:
					cond = 0;
					break;
					
				default:
					 System.out.println("Invalid Input");
					 break;
				}
	
			}
	 }
			
				else {
				System.out.println("Name not found");
				
				
			}
		}
		
		
	}

	@Override
	public void deletePerson() {
		System.out.println("Enter firstName to delete its Record");
		String name = sc.nextLine();
		
		for (int i=0; i<personInfo.size(); i++) {
			String personName = personInfo.get(i).firstName;
			if (name.equals(personName)) {
				
				personInfo.remove(i);
				System.out.println("Record Deleted");
				
			}
			else {
				System.out.println("Name Not found");
			}
	}
}
	@Override
	public void sortByName() {
		Collections.sort(personInfo, new NameComparator());
		System.out.println("Sorted by Name");
		for (Person p : personInfo) 
			System.out.println(p.toString());
		
		
	}

	@Override
	public void sortByZip() {
		Collections.sort(personInfo, new ZipComparator());
		System.out.println("Sorted by Zipcode:\n");
		for (Person p : personInfo) 
			System.out.println(p.toString());
		
	}

	@Override
	public void searchPerson() {
		sc = new Scanner(System.in);
		System.out.println("Enter firstname to search the details");
		String name = sc.nextLine();
		for (Person person : personInfo) {
			if(name.equals(person.firstName)) {
				System.out.println(person.toString());
			}
		 else {
			System.out.println("Name not found");
		 }
		}
	}

	@Override
	public void searchPhoneNumber() {
		sc = new Scanner(System.in);
		System.out.println("Enter phonenumber to search the details");
		String phone = sc.nextLine();
		for (Person person : personInfo) {
			if(phone.equals(person.phoneNumber)) {
				System.out.println(person.toString());
			}	
			else {
			System.out.println("Phonenumber not found");
			}
		}
		
		
	}

	@Override
	public void display() {
		System.out.println("Getting Information");
			for(Person person  : personInfo) {
				System.out.println(person.toString());
				
			}
		
	}

}
