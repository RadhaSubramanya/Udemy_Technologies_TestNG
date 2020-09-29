package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@AfterSuite
	public void Aftersuitepostcondition() {
		System.out.println("I am after suite");
	}
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void m1(String url) {
		System.out.println("Hi Radha");
		System.out.println(url);
	}

	@Test
	public void m2() {
		System.out.println("bye Radha");
	}
}
