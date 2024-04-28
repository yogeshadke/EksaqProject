package Eksagpro;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EkAddtocart {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set system properties for Chrome driver
        ChromeDriver drver = new ChromeDriver();
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void login() {
        // Navigate to the login page
        driver.get("https://uat.eksaqonline.com");
        
        driver.findElement(By.xpath("//div[@class='elementor-widget-wrap']//a[contains(text(),'Login')]")).click();
        // Enter username and password
        driver.findElement(By.xpath("//input[@name='wdm_username']")).sendKeys("testorguat1@mailinator.com");
        driver.findElement(By.xpath("//input[@name='wdm_password']")).sendKeys("Abcd@123");

        // Click on the login button
        driver.findElement(By.xpath("//input[@name='wdm_login']")).click();
        
        // Wait for login to complete
        // You can add WebDriverWait or Thread.sleep here
    }

    @Test(priority = 2)
    public void addCourseToCart() throws InterruptedException {
        // Navigate to the course page
       driver.get("https://uat.eksaqonline.com");
        
        driver.findElement(By.xpath("//div[@class='elementor-widget-wrap']//a[contains(text(),'Login')]")).click();
        // Enter username and password
        driver.findElement(By.xpath("//input[@name='wdm_username']")).sendKeys("testorguat1@mailinator.com");
        driver.findElement(By.xpath("//input[@name='wdm_password']")).sendKeys("Abcd@123");

        // Click on the login button
        driver.findElement(By.xpath("//input[@name='wdm_login']")).click();
      
               
        driver.findElement(By.xpath("//div[@class='main-menu  menu-border']//a[contains(text(),'Courses')]")).click();
      
      //div[@class="information customwidgetpd"]//input[@name="height_option"]
        driver.findElement(By.xpath("//div[@class='information customwidgetpd']//input[@name='height_option']")).sendKeys("1");
        
      //div[@class="information customwidgetpd"]//input[@name="width_option"]
        driver.findElement(By.xpath("//div[@class='information customwidgetpd']//input[@name='width_option']")).sendKeys("1");
        
      //button[@name="add-to-cart"]
        driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
      //div[@class="elementor-widget-wrap"]//div[@class="cart"]
        
        driver.findElement(By.xpath("//div[@class='elementor-widget-wrap']//div[@class='cart']")).click(); 
        // Click on the add to cart button
        //div[@class="cart-bottom"]//a[contains(text(),'Checkout')])[2]
        driver.findElement(By.xpath("//div[@class='cart-bottom']//a[contains(text(),'Checkout')])[2]")).click(); 
        // Wait for the course to be added to cart
    }

    @Test(priority = 3)
    public void proceedToPayment() {
        // Navigate to the cart page
        driver.get("https://uat.eksaqonline.com/cart");
    
    driver.findElement(By.xpath("//button[contains(text(),'Place order')]")).click(); 

  //input[@placeholder="Enter card number"]
    
    driver.findElement(By.xpath("//input[@placeholder='Enter card number']")).sendKeys("156765756757"); 
        // Add student and teacher details if required
    
     //select[@data-name="cardMonth"]
    
  //select[@data-name="cardYear"]
    driver.findElement(By.xpath("//input[@name='cvv2']")).sendKeys("156");
  //input[@name="cvv2"]
    driver.findElement(By.xpath("//input[@name='cname2']")).sendKeys("test");
  //input[@name="cname2"]
    driver.findElement(By.xpath("//button[contains(text(),'Make Payment')]")).click(); 
  //button[contains(text(),'Make Payment')]
    
   // Select obj = new Select(driver.findElement(By.id("Search-box")));
   
        // Fill in student and teacher details
        
        // Click on the proceed to payment button
        driver.findElement(By.id("proceed-to-payment")).click();
        
        // Wait for the payment page to load
    }
//
    

//    @Test(priority = 4)
//    public void makePayment() {
//        // Fill in payment details
//        // Enter all required payment details
//        
//        // Click on the make payment button
//        driver.findElement(By.id("make-payment")).click();
//        
//        // Wait for payment to process
//    }
//
//    @Test(priority = 5)
//    public void verifySuccessfulPaymentPage() {
//        // Verify if successful payment page is displayed
//        WebElement successMessage = driver.findElement(By.id("success-message"));
//        Assert.assertTrue(successMessage.isDisplayed(), "Successful payment page not displayed");
//    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
