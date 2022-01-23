package empwage;

import java.util.*;

public class empwage {
	public static void main (String []args) {
		System.out.println("welcome to employee wage computation");
		int maximum_working_hour=100;
		int Working_day_per_month=20;
		int Is_Full_Time=1;
		int Is_Part_Time=0;
		int emp_wage_per_hour=20;
		int fullDay_hour=8;
		int parttime_hour=4;
		int full_time_days=0;
		int partime_days=0;
		int emp_worked_hour=0;
		int total_worked_days=0;
		
		Random random=new Random();
		int number=random.nextInt(2);
		System.out.println(number);
		while(maximum_working_hour > emp_worked_hour &&  Working_day_per_month > total_worked_days)			
			total_worked_days++;

		switch(number)
		{
		case 0:
			int income=emp_wage_per_hour*fullDay_hour*Working_day_per_month;
			System.out.println("Employee is present and full day earning is="+income);
			Random random1=new Random();
			int number1=random.nextInt(2);
			System.out.println(number1);

			switch(number1)
			{
			case 1:
				int income1=emp_wage_per_hour*parttime_hour*Working_day_per_month;
				System.out.println("Employee Is Present And Part Time Day Earning Is="+income1);
				break;
			case 2 :
				System.out.println("employee is not doing partime");
				break;
			}
			break;
		case 1:
			System.out.println("Employee is absent hence there will be no earning");
			break;
		}
	}
}