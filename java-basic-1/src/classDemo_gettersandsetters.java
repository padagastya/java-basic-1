
public class classDemo_gettersandsetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i am going create an object which will refer to car class,object of car clsss using car classi will try access the methods
		Car bmw = new Car();
		bmw.setColor("orange");
		System.out.println(bmw.getColor());
		
		bmw.setYear(2050);
		System.out.println(bmw.year);
		System.out.println(bmw.getYear());
		
		Car toyota = new Car();
		System.out.println(toyota.getYear());
		toyota.setYear(1990);
		System.out.println(toyota.getYear());
		
		//getters and setters nothing but public methods which help us access pravite variable in that class
		

	}

}
