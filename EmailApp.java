package emailAdministrationApplication;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email employee1 = new Email("Glen", "Xu");
		
		employee1.setAlternateEmail("gx@gmail.com");
		System.out.println(employee1.getAlternateEmail());
		
		System.out.println(employee1.showInfo());
	}

}
