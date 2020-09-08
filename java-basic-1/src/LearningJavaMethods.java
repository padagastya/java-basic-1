
public class LearningJavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "Saurabh";
		helloUser(user);
		
		String warmregards = helloUser(user);
		
		user = "Alex";
		
		System.out.println("printing return value form the calling mehtod ="+warmregards);

	}
	
	public static String helloUser(String name) {
		
		System.out.println("Welcome"+name);
		System.out.println("Hey"+name+", thanks for watching Java videos");
		
		return "thanks";
	}

}
