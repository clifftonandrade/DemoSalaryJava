/*Hello i am Rishab a proffesional coder i made your code efficient*/
package main;
/**
 * @author cliffton andrade
 * @version 1.0
 * 
 * <b>Creating class Salary</b>
 */
public class Salary {
	
	private static int basicPay;
/**
 * Non parametrized Constructor
 */
	public Salary() {
		basicPay=0;
	}
	/**
	*@param bp -> It Initializes the basicPay
	 */
	public static void setBasicPay(int bP) {
		basicPay = bP;
	}
	/**
	*@return basicPay by multiplying 0.73 to it.
	 */
	public double calDA() {
		return basicPay*0.73;
	}
	/**
	*@return basicPay by multiplying 0.1 to it.
	 */
	public double calHRA() {
		return basicPay*0.1;
	}
	/**
	*@return basicPay by adding calDA() and calHRA() to it.
	 */
	public double calGrossSalary() {
		return  basicPay+calDA()+calHRA();
	}
	/**
	*@return calGrossSalary() by multiplying 0.3 to it.
	 */
	public double calIncomeTax() {
		return calGrossSalary()*0.3;
	}
	
	public double calNetPay() {
		return calGrossSalary()-calIncomeTax();
	}
}
