package addressBook;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookManagerImplement implements AddressBookManagerInterface {
	Scanner n = new Scanner(System.in);
	private Scanner input;
	String cap;
	
	private static final CharSequence CSV_HEADER = null;
	

	public void newAddressBook() {
			System.out.println("Enter Name of new AddressBook");
			String nam = n.nextLine();
			
			try {
					File obj = new File("C:\\Users\\nikam\\Desktop" +nam+ ".csv");
					if (obj.createNewFile()) {
						System.out.println("New Addressbook Created: " + obj.getName());
					}
					else {
					System.out.println("Addressbook already exists.");
					}
			}	catch (IOException e) {
				
				System.out.println("An error occurred.");
				e.printStackTrace();
			}				
	}

	public void openAddressBook() {
		File dirpath = new File(".");
		System.out.println("All AddressBook Files");
		File[] files = dirpath.listFiles(new FilenameFilter()  {
				public boolean accept(File dirpath, String name) {
				return name.endsWith(".csv");
		} 
	});
		for (File file : files) {
			System.out.println(file.getName());
			
		}
			
		
		System.out.println("Enter the AddressBook to Open: ");
		cap = n.nextLine();
		boolean filefound = false;
		for (File file :files) {
			if (file.getName().equals(cap)) {
		
				int cond=1; filefound = true;
				while (cond == 1) {
					AddressBookImplement menu = new AddressBookImplement();
					System.out.println("Address Book: "+cap+"\n"
							+ "1. Add Person\n"
							+ "2. Edit Person\n"
							+ "3. Delete Person\n"
							+ "4. Sort by name\n"
							+ "5. Sort by zip\n"
							+ "6. Search Person\n"
							+ "7. Search PhoneNumber\n"
							+ "8. Display\n"
							+ "9. Quit");
			System.out.println("Select an option from menu: ");
			input = new Scanner(System.in);
			int num = input.nextInt();
			switch (num) {
			case 1:
				menu.addPerson();
				break;
				
			case 2:
				menu.editPerson();
				break;
				
			case 3:
				menu.deletePerson();
				break;
				
			case 4:
				menu.sortByName();
				break;
				
			case 5:
				menu.sortByZip();
				break;
				
			case 6:
				menu.searchPerson();
				break;
				
			case 7:
				menu.searchPhoneNumber();
				break;
				
			case 8:
				menu.display();
				break;
				
			case 9:
				cond =0;
				break;
				
			default:
				System.out.println("Incorrect choice");
			}
				}
			}
			
		}
		if (filefound == false)
			System.out.println("AddressBook Not found ");
	}

	public void saveAddressBook() {
		FileWriter writer = null;
		 System.out.println(cap);
		try {
			
			writer = new FileWriter(cap);
			writer.append(CSV_HEADER);
			writer.append("\n");
			for (Person person : AddressBookImplement.personInfo) {
				writer.append(person.getfirstName());
				writer.append(",");
				writer.append(person.getlastName());
				writer.append(",");
				writer.append(person.getphoneNumber());
				writer.append(",");
				writer.append(person.getcity());
				writer.append(",");
				writer.append(person.getstate());
				writer.append(",");
				writer.append(person.getzip());
				writer.append("\n");
			}
			System.out.println("data saved.");
	}	 
		catch (IOException e) {
			System.out.println("CSV error!");
			e.printStackTrace();
		} finally {
			try {
		    writer.flush();
		    writer.close();
			} catch (IOException e) {
		        System.out.println("closing error!");
		        e.printStackTrace();
		      }
		}
		
	}
		

	public void saveAsAddressBook() {
		System.out.println("SaveAs:\nEnter AddressBook Name:\n");
		String newname = n.nextLine();
		
		 FileWriter writer = null;
			try {
				
				writer = new FileWriter(newname+".csv");
				writer.append(CSV_HEADER);
				writer.append("\n");
				for (Person p : AddressBookImplement.personInfo) {
					writer.append(p.getfirstName());
					writer.append(",");
					writer.append(p.getfirstName());
					writer.append(",");
					writer.append(p.getphoneNumber());
					writer.append(",");
					writer.append(p.getcity());
					writer.append(",");
					writer.append(p.getstate());
					writer.append(",");
					writer.append(p.getzip());
					writer.append("\n");
				}
				System.out.println("data saved.");
		}	 
			catch (IOException e) {
				System.out.println("Writing CSV error!");
				e.printStackTrace();
			} finally {
				try {
			    writer.flush();
			    writer.close();
				} catch (IOException e) {
			        System.out.println("Flushing/closing error!");
			        e.printStackTrace();
			      }
			}
	
		
	}

	public void closeAddressBook() {
		
	}

	public void quit() {
		
	
	}




}
