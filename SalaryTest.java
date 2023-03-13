package main;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalaryTest {
	static Salary s = new Salary();
	static Scanner sc =new Scanner(System.in);
	
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public static void setUp()   {
		System.out.println("Enter the Basic Pay of employee ");
		s.setBasicPay(sc.nextInt());
	}

	@Test
	public void calDATest() {
		assertEquals("Dearness Allowance",7300,s.calDA(),0.5);
	}
	
	@Test
	public void calHRATest() {
		assertEquals("House Rent Allowance",1000,s.calHRA(),0.5);
	}
	
	@Test
	public void calGrossSalaryTest() {
		assertEquals("Gross Salary",18300,s.calGrossSalary(),0.5);
	}
	
	@Test
	public void calIncomeTaxTest() {
		assertEquals("Income Tax",5490,s.calIncomeTax(),0.5);
	}
	
	@Test
	public void calNetPayTest() {
		assertEquals("Net Pay",12810,s.calNetPay(),0.5);
	}
}
