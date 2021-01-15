import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration{
	private String firstName;
	private String lastName;
	
	String firstNamePattern;
	
	public void setFirstLastName(boolean i){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String name;
		firstNamePattern = "[A-Z][a-z]{2}[a-z]*";
		while(flag){
			
			if(i){
				System.out.println("Enter First Name");
				name = firstName;		
			}
			else{
				System.out.println("Enter Last Name");
				name = lastName;		
			}
				name = sc.nextLine();
			
			if(!Pattern.matches(firstNamePattern, name)){
				flag = true; 
				System.out.println("wrong input");
			}
			else{
				lastName = name;
				if(i)
					firstName = name;
				flag = false;
				} 
		}		
	}
	
	public void setFirstName(){
	setFirstLastName(true);
	}
	public void setLirstName(){
	setFirstLastName(false);
	}
	
	public static void main(String args[]){
	
		UserRegistration UserReg = new UserRegistration();
		
		UserReg.setFirstName();
		UserReg.setLirstName();	
	}
}
