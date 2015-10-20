
public class Testimmutablestring1 {
	public static void main(String args[]){
		String firstName="Jack";
		String lastName="Lower";
		String fullName= firstName.concat(lastName);
		
		System.out.println(fullName);//returns true
	}

}

class Testimmutablestring{
	public static void main(String args[]){
		String firstName="Jack";
		String lastName="Lower";
		
		System.out.println(firstName.equals(lastName));//returns false
	}
}


