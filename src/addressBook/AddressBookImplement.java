package addressBook;

import java.util.ArrayList;
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
		boolean isfound = false;
		for (int i=0; i<personInfo.size(); i++) {
			String personName = personInfo.get(i).firstName;
			if (name.equals(personName)) {
				isfound = true;
				personInfo.remove(i);
				System.out.println("Record Deleted");
				
			}
		}
			if (isfound == false) {
				System.out.println("Not found");
			}
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchPhoneNumber() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("Getting Information");
			for(Person person  : personInfo) {
				System.out.println(person.toString());
				
			}
		
	}

}
