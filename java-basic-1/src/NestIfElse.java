
public class NestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 10;
		String city = "pune";
		
		
		if (num1 == num2) {
			System.out.println("Inside  1st if condition block");
			
			if (city.equalsIgnoreCase("pune")) {
				System.out.println("Inside 2nd if conditon block");
				System.out.println("Inside nested if condition");

				
			}
			
			}
			
		
		 System.out.println("outside nested if statement");

	}


}