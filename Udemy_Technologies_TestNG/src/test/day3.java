package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
@Test(enabled=false)
public void WebloginCarLoan()
{
	System.out.println("web login car");
}
@Parameters({"URL"})
@Test(timeOut=4000)
public void MobileloginCarLoan(String urlname)
{
	System.out.println("mobile login car");
	System.out.println(urlname);
}
@Test(groups= {"smoke"})
public void APIloginCarLoan()
{
	System.out.println("API login car");
	Assert.assertTrue(false);
}

@Test(dataProvider="getDataMethod")
public void dataAcceptingMethodn(String UN, String Pwd)
{
	System.out.println("data acceptor");
	System.out.println(UN);
	System.out.println(Pwd);
}

@AfterTest
public void precondition()
{
	System.out.println("I will execute after test");
}
@DataProvider
public Object[][] getDataMethod()
{
	//1st combination - username,password - good credit history	
	//2nd combination - username,password- no credit history	
	//3rd combination - username,password - fraudulent credit history
	Object data[][] = new Object[3][2];
	data[0][0] = "FirstUserName";
	data[0][1] = "FirstPassword";
	data[1][0] = "SecondUserName";
	data[1][1] = "SecondPassword";
	data[2][0] = "ThirdUserName";
	data[2][1] = "ThirdPassword";
	return data;
}
}
