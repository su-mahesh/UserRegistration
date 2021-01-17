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
	private String emailPattern = "[A-Za-z0-9_][+A-Za-z0-9_-]*[.]?[+A-Za-z0-9_-]+[@]([A-Za-z0-9]{1,}[.][A-Za-z]{2,63}|[A-Za-z0-9-]{2,}[.][A-Za-z0-9]{2,63}[.][A-Za-z]{2,3})";
	private String mobileNumberPattern = "^[1-9][0-9]{0,2}\\s[0-9]{10}";
	private String passwordPattern = "^(?=.{8,20}$)(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$";
	
	String[] emailAcceptList = new String[]{"abc@yahoo.com",
	"abc-100@yahoo.com",
	"abc.100@yahoo.com",
	"abc111@abc.com", 
	"abc-100@abc.net",
	"abc.100@abc.com.au",
	"abc@1.com",
	"abc@gmail.com.com",
	"abc+100@gmail.com"};
	
	String[] emailRejectList = new String[]{
	"abc",
	"abc@.com.my",
	"abc123@gmail.a",
	"abc123@.com",
	"abc123@.com.com",
	".abc@abc.com",
	"abc()*@gmail.com",
	"abc@%*.com",
	"abc..2002@gmail.com",
	"abc.@gmail.com",
	"abc@abc@gmail.com",
	"abc@gmail.com.1a",
	"abc@gmail.com.aa.au"
	};
	
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
	public void clearEmailList(){	
		int i = 0;
		System.out.println("\n***must accept list***");
		
		for(i = 0; i < emailAcceptList.length; i++ ){
			
				System.out.println((i+1)+": "+emailAcceptList[i]);
			if(Pattern.matches(emailPattern, emailAcceptList[i])){	
							
				System.out.println("pattern matched\n");
			}
			else
				System.out.println("pattern did not matched\n");	
		}
	
		System.out.println("***must reject list***");
		
		for( i = 0; i < emailRejectList.length; i++ ){
			
				System.out.println((i+1)+": "+emailRejectList[i]);			
			if(Pattern.matches(emailPattern, emailRejectList[i])){
							
				System.out.println("pattern matched\n");
			}
			else
				System.out.println("pattern did not matched\n");	
		}
	}	
	
	public static void main(String args[]){
	
		UserRegistration UserReg = new UserRegistration();
		
		UserReg.setFirstName();
		UserReg.setLastName();
		UserReg.setEmail();
		UserReg.setMobileNumber();
		UserReg.setPassword();
		UserReg.clearEmailList();
			
	}
}
