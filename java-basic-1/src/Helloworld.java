
public class Helloworld {

	public static void main(String[] args) {
	System.out.println("This is my 1st java program");


   // numeric data types without decimal
	
	byte byte_date =120;
	
	short short_data = 10500;
	
	int int_data = 2355435;
	long long_data = 435435435;
	
	//numbers with decimal
	
	float float_data = 0.98f;
	
	double double_data =0.98;
	
	boolean decision = true;
	char char_date = 'f';
	
	int num1 = 10;
	int num2 = 30;
	int Sum = num1 + num2; // operation on integer variable
	 
	 System.out.println("value of num1 before assiginemtnt = "+num1);
	 
	 num1 = num2;// assign to right to left
	 
	 System.out.println("value of num1 before assiginemtnt = " +num1);
	 System.out.println("addtion of two numbers= " + Sum);
	 
	 //type casting(implicit)
	 
	 int x = 10;
	 double y = x;// trying to assign a value int to double
	 System.out.println("printing value of y s= "+y);
	 
	 double abc = 10.5;// (explicit) data values should equal in both sides
	 int xyz = (int)abc;
	 
	
	}
}
