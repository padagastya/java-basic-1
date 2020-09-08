
public class Class2 extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // systax to create object
		//ClassName objectName = new ClassName(); String abc = "tests"
		//when we want to change the behavior of inharited method
		
		Class2 obj = new Class2();
		obj.testMethod();
		
		Class1 obj_1 = new Class1();
		obj_1.sound();
		obj.sound();
		obj.automation();
		
	}

	public void testMethod() {
		System.out.println("This is testMethod from Class2");
		
	}
	//overriding
    public void sound() {
    	System.out.println("hey guys how you doing....");
    }
}
