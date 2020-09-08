
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = AddNumbers(2,3,7);
		System.out.println("result after calling AddNumbers() method is = " + result);
		
		
		
      // advantage 
		//cleanliness of code
		//no need to remember multiple methods
		//increases readability
		// adding two numbers
	}
	public static int AddNumbers(int a, int b) {
		System.out.println("method 1 is invoked");
		return a+b;
	}
	 
	//we are adding three numbers
	public static int AddNumbers(int a, int b, int c) {
		System.out.println("method 2 is invoked");
		return a+b+c;
    }
}   