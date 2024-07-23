package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstpdef {
	
	WebDriver d;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException 
	{

			WebDriverManager.firefoxdriver().setup();
			d= new FirefoxDriver();
			d.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=AfchXnSHqVjHjTi0_EjTcQpN20kRzkzBSifJ65qN06NPs19_JlUKP5ZzT7O4K03MKlF3b2XiZkQrVsaejq5ECpa1gIwUi6OBQth8l8n9wCKjwQ&smuh=26684&lh=Ac9Alk4zV9iyPPynYsU");
			d.manage().window().maximize();
			Thread.sleep(3000);
		
		
	}

	@When("user enter username,password and login")
	public void user_enter_username_password_and_login() throws InterruptedException 
	{
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("9378020083");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Brainy@123");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	 
		
	
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() throws InterruptedException
	{
		Thread.sleep(4000);
		d.findElement(By.xpath("//span[text()='Brainy Yumlembam']")).click();	
	}



}
