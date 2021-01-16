import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration{
	private String firstName;
	private String lastName;
	private String email;
	String str = " ";
	boolean check = true;
	Scanner sc = new Scanner(System.in);

	private String firstLastNamePattern = "[A-Z][a-z]{2}[a-z]*";
	private String emailPattern = "[A-Za-z0-9_][A-Za-z0-9_.]{5,64}[@][A-Za-z0-9-]{2,}[.][A-Za-z]{1,63}([.][A-Za-z]{2})?";
	private String mobileNumberPattern = "^[1-9][0-9]{0,2}\\s[0-9]{10}";
	private String passwordPattern = "(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,20}";
	
	public boolean checkName(String str){	
	
	return Pattern.matches(firstLastNamePattern, str) ? true : false;					
	}
	
	public void setFirstName(){		
		while(check){	
			System.out.println("Enter First Name");
			str = sc.nextLine();
						
			if(checkName(str)){
				firstName = str;
				check = false;
			}
			else
				System.out.println("wrong format\n");				
		}
		check = true;
	}
	
	public void setLastName(){
		while(check){
			System.out.println("Enter Last Name");
			str = sc.nextLine();
						
			if(checkName(str)){
				lastName = str;
				check = false;
			}
			else
				System.out.println("wrong format\n");				
		}
		check = true;
	}
	
	public void setEmail(){
		boolean flag = true;				
		String str;
		
		while(flag){
					
				System.out.println("Enter email");
				str = sc.nextLine();;					
			
			if(!Pattern.matches(emailPattern, str)){
				flag = true;
				System.out.println("wrong format\n");
			}
			else
				flag = false;			 
		}				
	}
	
	public void setMobileNumber(){
	
		boolean flag = true;				
		String str;
		
		while(flag){
					
				System.out.println("Enter mobile number");
				str = sc.nextLine();;					
			
			if(!Pattern.matches(mobileNumberPattern, str)){
				flag = true;
				System.out.println("wrong format\n");
			}
			else
				flag = false;			 
		}			
	
	}
	
	public void setPassword(){
			
		boolean flag = true;				
		String str;
		
		while(flag){
					
				System.out.println("Enter password");
				str = sc.nextLine();;					
			
			if(!Pattern.matches(passwordPattern, str)){
				flag = true;
				System.out.println("wrong format\n");
			}
			else
				flag = false;			 
		}			
	
	}
	
	public static void main(String args[]){
	
		UserRegistration UserReg = new UserRegistration();
		
		UserReg.setFirstName();
		UserReg.setLastName();
		UserReg.setEmail();
		UserReg.setMobileNumber();
		UserReg.setPassword();
			
	}
}
