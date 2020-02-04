package stepdef3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case1 {
	WebDriver driver;
	
	@Given("user should be on sign up page")
	public void user_should_be_on_sign_up_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    driver=Drivers.getDriver("chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignUp")).click();
	    }


	@When("user enters username {string}")
	public void user_enters_username(String string) {
		driver.findElement(By.id("userName")).sendKeys("rajinik");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters firstname {string}")
	public void user_enters_firstname(String string) {
		driver.findElement(By.id("firstName")).sendKeys("alex");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters lastname {string}")
	public void user_enters_lastname(String string) {
		driver.findElement(By.id("lastName")).sendKeys("a");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.id("password")).sendKeys("1234");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user  re-enters password {string}")
	public void user_re_enters_password(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user selects gender as Male")
	public void user_selects_gender_as_Male() {
		driver.findElement(By.xpath("//input[@value= 'Male' and @type= 'radio']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters emailid {string}")
	public void user_enters_emailid(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("alex@gmail.com");
	
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters mobilenumber {string}")
	public void user_enters_mobilenumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
	}

	@When("user enters DOB {string}")
	public void user_enters_DOB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("dob")).sendKeys("08/24/1997");
	}

	@When("user enters address {string}")
	public void user_enters_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("address")).sendKeys("Hyderabad");
	}


	@When("user selects security question")
	public void user_selects_security_question() {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(1);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters the answer {string}")
	public void user_enters_the_answer(String string) {
		driver.findElement(By.id("answer")).sendKeys("Blue");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user clicks register")
	public void user_clicks_register() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.name("Submit")).click();
	
	}

	@Then("user should be on login page")
	public void user_should_be_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertEquals("Login",driver.getTitle());
		System.out.println("logged in!");
	}


/////////////////////////////////////////////////
	
@Given("user must be in login page")
public void user_must_be_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver=Drivers.getDriver("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignIn")).click();

}

@When("user enters {string} and {string}")
public void user_enters_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
    driver.findElement(By.id("userName")).sendKeys("rajinik");
    driver.findElement(By.id("password")).sendKeys("1234");
    
}

@When("performs login")
public void performs_login() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    driver.findElement(By.xpath("//input[@name='Login']")).click();
}

@Then("user must be in home page")
public void user_must_be_in_home_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals("Home", driver.getTitle());
	System.out.println("Home Page");
}

////////////////////////////////////////////////////////////////////


@Given("user should be in Home page")
public void user_should_be_in_Home_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	 driver=Drivers.getDriver("chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("rajinik");
	    driver.findElement(By.id("password")).sendKeys("1234");
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	    
}

@Given("clicks the search tab & enters the first four letters of the product")
public void clicks_the_search_tab_enters_the_first_four_letters_of_the_product() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    driver.findElement(By.id("myInput")).sendKeys("Head");
}

@Given("selects product from drop down")
public void selects_product_from_drop_down() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    driver.findElement(By.xpath("html/body/div[1]/form/div[1]/input")).click();
}

@Given("clicks on find details")
public void clicks_on_find_details() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
}

@Given("adds the product to cart")
public void adds_the_product_to_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    driver.findElement(By.xpath("html//body//section//div//div//div[2]//div//div//div//div[2]//center//a")).click();
}

@Then("user should be in add to cart page")
public void user_should_be_in_add_to_cart_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    Assert.assertEquals("Search",driver.getTitle());
    System.out.println("user is in search page");
}
///////////////////////////////////////////



@Given("user signin into testmeapp")
public void user_signin_into_testmeapp() {
	driver=Drivers.getDriver("chrome");
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    driver.findElement(By.linkText("SignIn")).click();
    driver.findElement(By.id("userName")).sendKeys("rajinik");
    driver.findElement(By.id("password")).sendKeys("123");
    driver.findElement(By.xpath("//input[@name='Login']")).click();
    Assert.assertEquals("Home",driver.getTitle());
    System.out.println("Home page");
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("user searches for a particular product")
public void user_searches_for_a_particular_product() {
	driver.findElement(By.id("myInput")).sendKeys("Head");
	driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).click();
	driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
}

@Given("user proceeds for payment without adding to cart")
public void user_proceeds_for_payment_without_adding_to_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	Assert.assertNotSame("View Cart",driver.getTitle());

}

@Then("TestMeApp doesnt display the cart icon")
public void testmeapp_doesnt_display_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.out.println("cart is empty...please add");
}

@Given("user proceeds for payment after adding to cart")
public void user_proceeds_for_payment_after_adding_to_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("html//body//section//div//div//div[2]//div//div//div//div[2]//center//a")).click();
}

@Then("testmeapp displays cart icon")
public void testmeapp_displays_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	Assert.assertEquals("Search", driver.getTitle());
	System.out.println("user is in search page");
}

}

