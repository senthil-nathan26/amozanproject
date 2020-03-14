package TestNG;

import org.testng.annotations.Test;

public class TestNg {
	@Test(priority=1)
	public void Amazon()
	{
		System.out.println("URL");
		
	}
	
	@Test(priority=2,dependsOnMethods="Amazon")
	public void Purchase()
	{
		System.out.println("Purchase");
	}
	
	@Test(priority=3,dependsOnMethods="Purchase")
	public void Card_ADD()
	{
	System.out.println("CArD ADD");	
	}
	
	

	
	
	
	
	
	

}
