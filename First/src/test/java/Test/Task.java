package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	WebDriverWait wait;
	JavascriptExecutor js;
	WebDriver driver;
	
	@Test(priority = 0)
	
	public void userRegister() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://airstar.abservetechdemo.com/");
		 // account icon
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 js = (JavascriptExecutor) driver;
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("demo-customized-button"))).click();
		 //sign in//*[text()='Sign up']
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign up']"))).click();
		 //drop down country
		 WebElement dropCountry = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("phonenumberCountry")));
		 Select s = new Select(dropCountry);
		 s.selectByVisibleText("India");
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("phonenumber"))).sendKeys("9989898966");
		 //continue button
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Continue']"))).click();
		 //enter first name
		 wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("Hardik");
		 //enter last
		 wait.until(ExpectedConditions.elementToBeClickable(By.name("lastname"))).sendKeys("P");

		 //calendar icon (//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[3]"))).click();
		 Thread.sleep(200);
		 //year //*[text()='April 2024']
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='April 2024']"))).click();
		 //select 2000
		 WebElement scroll = driver.findElement(By.xpath("//*[text()='2000']"));
		
		 js.executeScript("arguments[0].scrollIntoView();", scroll);
		 scroll.click();
		 //4
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='4'])[3]"))).click();
		 //email
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email"))).sendKeys("12s482@gmail.com");
		 //password
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("1234");
		 //continue button

		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Continue']"))).click();
	}
	
	@Test(priority = 1)
	public void hostCreation() throws InterruptedException, AWTException {
		 Thread.sleep(2000);
		 //pop up cancel icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']"))).click();
		 //account icon
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("demo-customized-button"))).click();

		 Thread.sleep(1000);
		 //account outside
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax'])"))).click();
		 //become a host
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Become a Host']"))).click();
		 //get started
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Get Started ']"))).click();
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		 //hotel
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Hotel'])"))).click();
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //an entire place
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_labelcheck__lv3a_'])[1]"))).click();
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //enter click
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='funkystyling']"))).click();
		 //drop down value
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Tamil Nadu, India']"))).click();
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //scroll
		 //pincode
		 WebElement pin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[6]")));
		 js.executeScript("arguments[0].scrollIntoView();", pin);
		 pin.sendKeys("523001");
		 Thread.sleep(1000);
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //children plus icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[2]"))).click();
		 //pets plus icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[3]"))).click();
		 //bedrooms
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[4]"))).click();

		 //bathrooms scroll
		 WebElement bathroom = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Bathrooms']")));
		 js.executeScript("arguments[0].scrollIntoView();", bathroom);
		 Thread.sleep(1000);
		 //bathrooms plus icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[5]"))).click();
		 //bathrooms minus icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_add_btn__WR4aA'])[5]"))).click();
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //king plus icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_Box__8lPXh'])[2]"))).click();
		 //queen plus icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_Box__8lPXh'])[4]"))).click();
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //air conditioning
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Air conditioning']"))).click();
		 //central heating
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Central heating']"))).click();
		 //indoor fireplace
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Indoor fireplace']"))).click();
		 //outdoor dining
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Outdoor Dining']"))).click();
		 //shower
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Shower']"))).click();
		 //hot tub
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Hot Tub']"))).click();
		 //bbq
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='BBQ']"))).click();
		 //scroll paid
		// WebElement paid = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Paid Parking']")));
		// js.executeScript("arguments[0].scrollIntoView();", paid);

		 js.executeScript("window.scrollBy(0,1500)", "");

		 Thread.sleep(500);
		 //shaving cream
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='undefined'])[10]"))).click();

		 //razor
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='undefined'])[11]"))).click();
		 Thread.sleep(1000);
		 //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();

		 //upload
		 WebElement upload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='page_custom_fileupload__VezBB pt-2']")));
		 upload.click();
//		 upload.sendKeys("C:\\Users\\E-7\\Downloads\\logo.png");
		 
		 String file = "C:\\Users\\Press\\Downloads\\bike.jpg";

	       Thread.sleep(1000);
	    StringSelection selection=new StringSelection(file);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	    Robot robot=new Robot();

	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     //second upload
	     
	     Thread.sleep(3000);
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='page_custom_fileupload__VezBB w-100 h-100']"))).click();
	     String file2 = "C:\\Users\\Press\\Downloads\\bike.jpg";

	       Thread.sleep(1000);
	    StringSelection selection2=new StringSelection(file2);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null);


	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     //third upload
	     Thread.sleep(3000);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='page_custom_fileupload__VezBB w-100 h-100']"))).click();
	     String file3 = "C:\\Users\\Press\\Downloads\\bike2.jpg";

	       Thread.sleep(2000);
	    StringSelection selection3=new StringSelection(file3);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection3, null);


	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(1000);
	     
	   //bathrooms scroll
		 WebElement fourth = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='page_custom_fileupload__VezBB w-100 h-100']")));
		 js.executeScript("arguments[0].scrollIntoView();", fourth);
	     
		 
	   //fourth upload
		 Thread.sleep(3000);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='page_custom_fileupload__VezBB w-100 h-100']"))).click();
	     String file4 = "C:\\Users\\Press\\Downloads\\bike3.jpg";

	       Thread.sleep(2000);
	    StringSelection selection4=new StringSelection(file4);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection4, null);


	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	   //five upload
	     Thread.sleep(3000);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='page_custom_fileupload__VezBB w-100 h-100']"))).click();
	     String file5 = "C:\\Users\\Press\\Downloads\\bike.jpg";

	       Thread.sleep(2000);
	    StringSelection selection5=new StringSelection(file5);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection5, null);


	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	   //next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		 
		 //enter text
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='page_textarea__DTCr_ w-100 p-2 p-md-3 p-lg-4']"))).sendKeys("Test House");
		 
		//next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		 
		 //create next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		//finish next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		 
		 //edit icon
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='page_editicon__s5SNp']"))).click();
		 
		 
		 //enter amount
		 WebElement enterAmount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type='number'])[1]")));
		 enterAmount.click();
		 enterAmount.clear();
		 enterAmount.sendKeys("1000");
		 
		 //minimum night
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[2]"))).click();
		//minimum night
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[2]"))).click();
		 
		 //extra guest
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[3]"))).click();
		//extra guest
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='page_del_btn__x8bLg'])[3]"))).click();
		 Thread.sleep(1000);
		 
		 //scroll 500
		 WebElement scroll500 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Extra price per guest']")));
		 js.executeScript("arguments[0].scrollIntoView();", scroll500);

		 Thread.sleep(500);
		// Enter amount 2
		WebElement enterAmount2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='page_extrapricetext__HUsd5']")));
	
		Actions actions = new Actions(driver);
		actions.doubleClick(enterAmount2).perform();
		
		WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='number'])[2]")));

		// Clear the input field
		inputElement.clear();

		// Send the value you want
		inputElement.sendKeys("200");
		
		//next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		 
		//next
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Next'])[4]"))).click();
		 
		 //publish
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Publish']"))).click();
		 
		 

		 }
		
	}


