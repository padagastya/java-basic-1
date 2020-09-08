
public class Forloop {

	public static void main(String[] args) {
	
	//TODO Auto-generated method stub
// first step : initialization happens first and onlu one time, which means that the initialization part of for loop only executes once.
	//	second step : condition in for loop is evaluated on each iteration, if the condition is true then the statement inside for loop body gets executed. once the condition returns false, the statements in for loop does not execute and the control gets transferred to the next statement in the program after for loop.
		// third step : after every execution of for loop's body, the increment/decrement part of for loop executes that updates the loop counter.
		// fourth step: after third step, the control jumps to second step and condition is re- evaluted.
		     for (int i=0; i <= 5; i++) {
		    	 System.out.println(("printing the value of i"+i));
		    	 
		     }
		     System.out.println("outside for loop");
	}

}
