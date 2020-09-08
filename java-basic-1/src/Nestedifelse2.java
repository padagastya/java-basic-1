
public class Nestedifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 10;
		String city = "pune";
		int num3 = 300;
		
		
		if (num1 == num2) {
			System.out.println("Inside  1st if condition block");
			System.out.println("Inside  1st if condition block");
			
			if(num1 > num3) {
				System.out.println("num1 is greater than num3");
			}
			
		} else {
		
			
			if (city.equalsIgnoreCase("pune")) {
				System.out.println("Inside 1st else conditon block");
				System.out.println("Inside nested if condition");
				if (num3 > 200) {
					System.out.println("Inside 3nd if conditon block");
					System.out.println("num3 is greater than 200");
					
					
				}else {
					System.out.println("Inside 2nd if conditon block");
					System.out.println("num3 is less than 200");
				}
			}
			
			}
		 System.out.println("outside nested if statement");

	}

	    }

	

