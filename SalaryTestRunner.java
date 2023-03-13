package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class SalaryTestRunner {
	
	public static void main(String[] args) {
		Result results = JUnitCore.runClasses(SalaryTest.class);
		
		for(Failure fail : results.getFailures()){
			System.out.println(fail.toString());
		}
		
		if(results.wasSuccessful()) {
			System.out.println("Tests were sucessful");
		}else {
			System.out.println("\nTests were not sucessful");
		}
		
	}
	
}
