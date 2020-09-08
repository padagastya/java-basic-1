
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "This is my Java learning";
		String result = abc.toUpperCase();
		
		
		System.out.println("printing value of result variable ="+result);
		
		abc = "ANTOHER METHOD OF ABC";
		
		result = abc.toLowerCase();
		
		System.out.println("printing value of result variable ="+result);
          
		result = result.substring(5,12);
		System.out.println("values after using substring is = "+result);
		
		System.out.println("value after using length method is "+ result.length());
		
		/*..........string methods 02......*/
		
		//trim()
		
		String str01 = "     wow i am learning JAVA     ";
		System.out.println("printing intial value = "+str01.trim());
		
		//concat
		
		String  str02 = "I am enjoying it";
		
		System.out.println("printing without using concat() = "+str02);
		System.out.println("printing without using concat()= "+str02.concat(str01));
		
		// replace
		
		System.out.println("printing without using concat() = "+str02);
		System.out.println("printing without using concat() = "+str02.replace("enjoying","learning it again "));
		
		//equals
		
		String str05 = "JAVA IS AN AWESOME";
		String str06 = "  JAVA IS AN AWESOME   ";
		
		System.out.println("printing after using equals ="+str05.equals(str06));
		System.out.println("printing after using equals ="+str05.trim().equals(str06.trim()));
		
		//contains
		
		System.out.println("printing with using contain method "+str05.contains("AWESOME"));
		
		
		
		
		
		
	}

}
