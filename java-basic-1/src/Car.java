
public class Car {

	 //System.out.println("Created no argument constrcutor");
	public Car() {
		 System.out.println("Created no argument constrcutor");
		//super();
	}

	public Car(String color, String model) {
		 System.out.println("Created constrcutor with argumeny");
		 this.color = color;
		 this.model = model;
		 System.out.println("printing color and model :color ="+this.color+" and model ="+this.model);
	}
	
	// class is blue print or templet using which we can create an object
	// object
	// 1.state
	// 2.behaviour
	
	

	// state
	// make
	private String color;
	// model



	private String model;
	
	
	// year
	public int year;

	// behaviour
	public void increaseSpeed() {
		System.out.println("please increase the speed of my car");
	}

	public void setColor(String color) {
		this.color = color;
		// this key word when ever we want access of mumber variable which is pravite or
		// when ever set variable which is pravite

	}

	public String getColor() {
		return color;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {

		if (year > 1500) {

			this.year = year;

		} else {
			System.out.println("This is not valid input, please enter year > 1500");
		}
	}
	// TODO Auto-generated method stub

}
