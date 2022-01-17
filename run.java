import java.util.*;
import java.io.*;

public class Run {

	public static void main (String [] args) throws IOException {

		Run a = new Run();

		Scanner scan = new Scanner (System.in);


		System.out.println("Login: Press L");
		System.out.println("Create User: Press C");
		String temp = scan.nextLine();

		if (temp.equals("C")){

			a.createUser("");

			}

		if (temp.equals("L")){

			}

			a.logIn();

			}

		public void createUser(String filename) throws IOException  {

			BufferedReader br = new BufferedReader(new FileReader(filename));
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
			Scanner scan = new Scanner (System.in);

			System.out.println("Please enter a username: ");
			String username = scan.nextLine();

			System.out.println("Please enter your first name: ");
			String firstName = scan.nextLine();

			System.out.println("Please enter your last name: ");
			String lastName = scan.nextLine();

			System.out.println("Please enter a password: ");
			String password = scan.nextLine();

			DAO access = new DAO(username, firstName, lastName, password);

			String line = "";

			while((line = br.readLine()) != null) {

				bw.write(username + "," + firstName + "," + lastName + "," + password);
				bw.close();

				}
			}

		public void logIn() throws IOException {

			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
			Scanner scan = new Scanner(System.in);

			System.out.println("Please enter your username");

			}
	}
