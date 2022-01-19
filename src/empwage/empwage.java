package empwage;

import java.util.*;

public class empwage {
	public static void main (String []args) {
		System.out.println("welcome to employee wage computation");
<<<<<<< HEAD
		int Is_Full_Time=1;
		int Is_Part_Time=0;
		int emp_wage_per_hour=20;
		int fullDay_hour=8;
		int parttime_hour=4;
		Random random=new Random();
		int number=random.nextInt(2);
		if(number==Is_Full_Time)
		{
				int income=emp_wage_per_hour*fullDay_hour;
				System.out.println("Employee is present and full day earning is="+income);
		}
		else
		{
			int income=emp_wage_per_hour*parttime_hour;
			System.out.println("Employee Is Present And Part Time Day Earning Is="+income);
		}
=======
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
>>>>>>> 488f7ac9dbd9df8115eef4d434813f397ecd1245
		}
}

