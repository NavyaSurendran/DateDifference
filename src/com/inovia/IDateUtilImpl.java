package com.inovia;

/**
 * @author Navya Surendran
 *
 */
/**
 * @author DELL
 *
 */
public class IDateUtilImpl implements IDateUtil{

	/* (non-Javadoc)
	 * @see com.inovia.IDateUtil#diff(com.inovia.Date, com.inovia.Date)
	 * This Method will find the difference of two dates considering the leap year and
	 * days in months.
	 */
	@Override
	public int diff(Date firstDate, Date secondDate) {
		int yearDiff =0;
		int monthDiff =0;
		int dayDiff =0;
		int noOfLeapYear =0;
		int evenMonths =0;
		int oddMonths =0;
		int days =0;
		if(firstDate != null && secondDate != null) {
						
				yearDiff = secondDate.getYyyy() - firstDate.getYyyy();			
				monthDiff = secondDate.getMm() - firstDate.getMm();
				dayDiff = secondDate.getDd() - firstDate.getDd(); 				
				
				if(yearDiff !=0) {
					//checks no of leap years crossed.
					 noOfLeapYear = yearDiff/4;
				}
				if(monthDiff !=0) {
					// even months will have only 30 days whereas odd months have 30 days
					 evenMonths = monthDiff/2;
					 oddMonths = monthDiff -evenMonths;
				}
				if(checkForFebruary(firstDate)) {
					//if the date crossed february then we have to take that into accont
					//since it has only 28 or 29 days
					evenMonths = evenMonths -1;
					if(checkForLeapYear(firstDate)) {						
						days = (yearDiff *12 *365) + noOfLeapYear + (evenMonths *30) + 29 + (oddMonths*31) + dayDiff;
					}else {
						days = (yearDiff *12 *365) + noOfLeapYear + (evenMonths *30) + 28 + (oddMonths*31) + dayDiff;
					}
					
				 }else if(checkForFebruary(secondDate)) {
					evenMonths = evenMonths -1;
					if(checkForLeapYear(secondDate)) {						
						days = (yearDiff *12 *365) + noOfLeapYear + (evenMonths *30) + 29 + (oddMonths*31) + dayDiff;
					}else {
						days = (yearDiff *12 *365) + noOfLeapYear + (evenMonths *30) + 28 + (oddMonths*31) + dayDiff;
					}
				}else {
					days = (yearDiff *12 *365) + noOfLeapYear + (evenMonths *30) + (oddMonths*31) + dayDiff;
				}
				  
				
			System.out.println(yearDiff);
			System.out.println(monthDiff);
			System.out.println(dayDiff);
			System.out.println("days ----" +days);
		}
		return days;
	}

	
	/**
	 * @param date
	 * @return
	 * This method will check whether the date lies in the month of february.
	 */
	private boolean checkForFebruary(Date date) {
		if(date.getMm() ==2 ) {
			return true;
		}
		return false;
	}
	
	/**
	 * @param date
	 * @return
	 * This month will check the date is a leap year or not.
	 */
	private boolean checkForLeapYear(Date date) {
		if(date.getYyyy() %4 ==0) {	
			return true;
		}
		return false;
	}
}
