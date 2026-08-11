package letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
	
		
		
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.drivers", "./drivers/Chrome.exe");
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://letcode.in/");
				
				driver.findElement(By .className("button is-primary is-rounded is-large\"]")).click();
				
				driver.findElement(By .xpath("//button[.=\"LOGIN\"]")).click();
				
				
				//driver.findElementByLinkText("Log in").click();
				
			//	driver.findElementByName("email").sendKeys("koushik350@gmail.com");
				
			//	driver.findElementByName("password").sendKeys("Pass123$");
				
			//driver.findElementByXPath("//button[.=\"LOGIN\"]").click();
				
			//	driver.wait(4000);
			
//				driver.findElement(By.id("testing")).click();
//				
//				driver.findElement(By.id("edit")).click();
//				
//				driver.findElements("fullName").sendKeys("Bala");
//				
//				driver.findElements("join").sendKeys(" Person",Keys.TAB);
//				
//			String Myvalue= driver.findElements("getMe").getAttribute("value");
//			System.out.println(Myvalue);
//			
//			driver.findElements("clearMe").clear();
//			
//			boolean isedit=  driver.findElements("noEdit").isEnabled();
//			System.out.println(isedit);
//			
//			String isreadonly = driver.findElements("dontwrite").getAttribute("readonly");
//			System.out.println(isreadonly);
//			
//			driver.quit();
			
			
			
				
				

			}

	

		// TODO Auto-generated method stub

	}


