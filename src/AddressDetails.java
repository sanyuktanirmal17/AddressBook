
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressDetails {
	private static Scanner scanner = new Scanner(System.in);
	List<Person> personList = new ArrayList<>();

	private void add() {
		Person person = new Person();
		System.out.println("Enter fname:");
		person.setFirstName(scanner.next());
		System.out.println("Enter Lname:");
		person.setLastName(scanner.next());
		System.out.println("Enter Address:");
		person.setAddress(scanner.next());
		System.out.println("city:");
		person.setCity(scanner.next());
		System.out.println("State:");
		person.setState(scanner.next());
		System.out.println("ip:");
		person.setZip(scanner.next());
		System.out.println("Phone:");
		person.setPhone(scanner.next());
		System.out.println("Email:");
		person.setEmail(scanner.next());

		personList.add(person);
	}

	private void edit() {
		System.out.println(" Enter first name to Edit");
		String setFirstName = scanner.next();

		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(setFirstName))
				personList.Update(i);
		}
		
	}
	
	private void delete() {
		System.out.println(" Enter first name to delete");
		String setFirstName = scanner.next();

		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(setFirstName))
				personList.remove(i);
		}
	}

	public void show() {
		System.out.println(personList);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book");
		boolean isExit = false;

		while (!isExit) {
			System.out.println("Welcome to address book");
			AddressDetails detail = new AddressDetails();
			System.out.println("Enter options 1.Add\n2.Edit\n3.Delete\n4.Exit\n5.Show Contact");
			int userInput = scanner.nextInt();

			switch (userInput) {
			case 1:
				// add
				detail.add();
				break;
			case 2:
				// Edit
				detail.edit();
				break;
			case 3:
				detail.delete();
			case 4:
				detail.show();
				break;
			case 5:
				isExit = true;
				break;
			default:
				System.out.println("Please enter valid input");
			}
		}
	}

}
