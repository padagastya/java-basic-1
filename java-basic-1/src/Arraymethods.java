import java.util.Arrays;
public class Arraymethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		num[0] = 79;
		num[1] = 43;
		num[2] = 10;
		num[3] = 23;

		num[4] = 3;
		System.out.println("lenth of an array is ="+num.length);
		
		Arrays.sort(num);// sorting the num array
		
		for (int i = 0; i<num.length; i++) {
			System.out.println("printing array before sorting"+num[i]);
		}
		
		


	}

}
