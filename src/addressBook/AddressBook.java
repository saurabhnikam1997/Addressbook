package addressBook;

import java.util.Scanner;

	public class AddressBook {

		private static Scanner sc;

		public static void main(String[] args) {
			int cond=1;
		
				
			while (cond == 1) {
				AddressBookManagerImplement addressBookManager = new AddressBookManagerImplement();
					
				System.out.println("Welcome To Address Book\n"
							+ "1.Create newAddressBook\n"
							+ "2.Open Existing AddressBook\n"
							+ "3.Save Address Book\n"
							+ "4.Save As Address Book\n"
							+ "5.Close Address Book\n"
							+ "6.Quite");
					
					System.out.println("Select An Option: ");
					
					sc = new Scanner(System.in); 

					
					int num = sc.nextInt();
					switch (num) {
					case 1:
						addressBookManager.newAddressBook();
						break;
					case 2:
						addressBookManager.openAddressBook();
						break;
					case 3:
						addressBookManager.saveAddressBook();
						break;
					case 4:
						addressBookManager.saveAsAddressBook();
						break;
					case 5:
						addressBookManager.closeAddressBook();
						break;
					case 6:
						addressBookManager.quit();
						break;
	                default:
	                	System.out.println("Incorrect Choice");
	
				}				
			}
		}
	}


