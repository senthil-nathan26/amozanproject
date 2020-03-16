package logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import loginpage.Basepage;
import loginpage.Loginpage;

public class Logintest {

	Loginpage lgp5;
	Basepage  bp;
	
	public Logintest()
	{
		lgp= new Loginpage();
		bp = new Basepage();	
	}
	@Test
	public void user()
	{
		lgp.user().sendKeys("Senthilks");
		Assert.assertEquals(lgp.getTitlte().contains("username"),"Failed");
	}
	@Test
	public void pass()
	{
		lgp.pass().sendKeys("743702");
		Assert.assertEquals(lgp.getTitlte().contains("password"),"Failed");
	}
	@Test
	public void btLogin()
	{
		lgp.clicks().click();
	}
	
}
