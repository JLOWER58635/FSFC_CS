
public class Controller {
	public static void main(String[] args){
		float nOne, nTwo;
		Calculator jacksCalculator = new Calculator();{
	}
	nOne = Float.parseFloat(args[0]);
	nTwo = Float.parseFloat(args[1]);
	
	jacksCalculator.setNumOne(nOne);
	jacksCalculator.setNumTwo(nTwo);
	
	System.out.println("adding " + jacksCalculator.add());
	System.out.println("subtracting " + jacksCalculator.subtract());
	System.out.println("multiplying " + jacksCalculator.multiply());
	System.out.println("division " + jacksCalculator.divide());{
		
	}
		
		
	

	
	
