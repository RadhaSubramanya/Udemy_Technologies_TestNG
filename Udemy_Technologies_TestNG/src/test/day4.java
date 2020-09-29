package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@BeforeMethod
	public void beforemethodprecondition() {
		System.out.println("before method");
	}

	@AfterMethod
	public void aftermethodprecondition() {
		System.out.println("after method");
	}
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname ) {
		System.out.println("web login Home");
		System.out.println(urlname);
	}

	@Test
	public void MobileloginHomeLoan() {
		System.out.println("mobile login Home");
	}

	@Test
	public void MobilesigninHomeLoan() {
		System.out.println("mobile sign in");
	}

	@Test(dependsOnMethods= {"MobileloginHomeLoan","MobilesigninHomeLoan"})
	public void MobilesignoutHomeLoan() {
		System.out.println("mobile sign out");
	}

	@Test(groups= {"smoke"})
	public void APIloginHomeLoan() {
		System.out.println("API login Home");
	}

	@BeforeSuite
	public void Beforesuiteprecondition() {
		System.out.println("I am before suite");
	}
}
