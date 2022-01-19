package empwage;

import java.util.Random;

public class empwage {
	public static void main (String []args) {
		System.out.println("welcome to employee wage computation");
		Random random=new Random();
		int number=random.nextInt(2);
		if(number==0)
			System.out.println("Employee is present");
		else
			System.out.println("employee is absent");
		}
}
