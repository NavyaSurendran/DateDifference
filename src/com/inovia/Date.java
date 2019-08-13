package com.inovia;

/**
 * @author Navya Surendran
 *
 */
public class Date {
	private int dd;
	private int mm;
	private int yyyy;
	
	public Date() {
		
	}
	
	public Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return yyyy;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	
	
	
}
