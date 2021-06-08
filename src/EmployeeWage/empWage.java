package EmployeeWage;

public class empWage {

			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
			private int EMP_RATE_PER_HOUR = 20;
			private int NUM_OF_WORKING_DAYS = 2;
			private final int MAX_HOURS_IN_MONTH = 10;
			private int MAX_HRS_IN_MONTH = 0;
			private String company;
			
			public  empWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH)
			{
				this.company=company;
				this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
				this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
				this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
			}
			public static void main(String args[]) {
				empWage dMart = new empWage("dMart", 20,4,10 ); 
				int empHrs = 0, totalHrs = 0, totalWorkingDays = 0;
				int empWage = 0;
				int NUMBER_OF_WORKING_DAYS = 0;
				while (totalHrs <= dMart.MAX_HRS_IN_MONTH && totalWorkingDays < dMart.NUM_OF_WORKING_DAYS) {
					totalWorkingDays++; 
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;
					System.out.println("Welcome to employee wage computation");
					switch (empCheck) {
					case IS_PART_TIME:
						empHrs = 4;
						break;
					case IS_FULL_TIME:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
					}
					totalHrs += empHrs;
					System.out.println("Day#:" + totalWorkingDays + "Emp Hr:"+empHrs);
				}
				int totalEmpWage = totalHrs * dMart.EMP_RATE_PER_HOUR;
//				String company = null;
				System.out.println("Total Emp Wage for Company" + dMart.company+"is:"+totalEmpWage);
			}
			
		
		}


