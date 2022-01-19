package empwage;

import java.util.*;

public class empwage {
	public static void main (String []args) {
		System.out.println("welcome to employee wage computation");
		int emp_wage_per_hour=20;
		int fullDay_hour=8;
		Random random=new Random();
		int number=random.nextInt(2);
		if(number==1)
			{
				int income=emp_wage_per_hour*fullDay_hour;
				System.out.println("Employee is present and full day earning is="+income);
			}
		else
			{
				System.out.println("employee is absent");
			}
		}
}
