import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration{
	private String firstName;
	
	String firstNamePattern;
	
	public void setFirstName(){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		firstNamePattern = "[A-Z][a-z]{2}[a-z]*";
		while(flag){
		
			System.out.println("Enter First Name");
			firstName = sc.nextLine();
			
			if(!Pattern.matches(firstNamePattern, firstName)){
				flag = true; 
				System.out.println("wrong input");
			}
			else
				flag = false; 
		}		
	}
	
	public static void main(String args[]){
	
		UserRegistration UserReg = new UserRegistration();
		
		UserReg.setFirstName();		
	}
}
