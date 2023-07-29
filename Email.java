package emailAdministrationApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "CompanyName.com";
	private String email;
	
	//constructor to get the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created for: " + this.firstName + " " + this.lastName );
		
		//call a method to ask for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//return a random password
		this.password = createRamdomPassword(defaultPasswordLength);
		System.out.println("your password is: " + this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your email is: " + email );
	}
	
	//ask for the department 
	private String setDepartment() {
		System.out.print("Departmetn Code\n1 for sales\n2 for Software Development\n3 for Accounting\n0 for none\nPlease Enter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "softwareDev";}
		else if(depChoice == 3) {return "acct";}
		//else {return }
		else {
			return "";
		}
	}
	
	
	//generate a random password
	private String createRamdomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			//System.out.println(rand);
			//System.out.println(passwordSet.charAt(rand));
		}
		return new String(password);
	}
	//set the mailbox capacity
	public void setMailboxCapaciy(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapcity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name:" + firstName + " " + lastName + "\nCompany Email:" + " "
				+ email +" " + "\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
	
}
