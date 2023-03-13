package main;

public class Salary {
	
	private static int basicPay;

	public Salary() {
		basicPay=0;
	}
	
	public static void setBasicPay(int bP) {
		basicPay = bP;
	}
	
	public double calDA() {
		return basicPay*0.73;
	}
	
	public double calHRA() {
		return basicPay*0.1;
	}
	
	public double calGrossSalary() {
		return  basicPay+calDA()+calHRA();
	}
	
	public double calIncomeTax() {
		return calGrossSalary()*0.3;
	}
	
	public double calNetPay() {
		return calGrossSalary()-calIncomeTax();
	}
}
