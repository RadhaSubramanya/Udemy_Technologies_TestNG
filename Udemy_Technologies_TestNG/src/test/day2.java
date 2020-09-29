package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
@Test
public void m3()
{
	System.out.println("Good");
}

@BeforeTest
public void precondition()
{
	System.out.println("I will execute before test");
}
}
