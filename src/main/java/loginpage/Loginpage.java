package loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage {

	@FindBy(id="username")
	private WebElement user;
	
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement btlogin;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	 
    public WebElement user()
    {
		return user;
    	
    }
	
	public WebElement pass()
	{
		return pass;
		
	}
	
	public WebElement clicks()
	{
		return btlogin;
		
	}
	
	
}
