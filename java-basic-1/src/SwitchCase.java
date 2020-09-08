
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Month from generator is"+DecisionMaker(2));
	}
	public static String DecisionMaker(int month) {
		String monthName;
		switch(month) {
		case 1: monthName = "Jan";
		    break ;
		case 2: monthName = "Feb";
		if(true) {
			System.out.println("just a line");
		}
		    break;
		case 3: monthName = "Mar";
	    break;
		case 4: monthName = "April";
	    break;
		 default: monthName = "Invalid month, please make sure you are providing an input from 1-12";
	    break;
		
		}
		return monthName;
		
		}
	}


