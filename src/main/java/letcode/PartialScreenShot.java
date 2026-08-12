package letcode;

import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import javax.imageio.*;

public class PartialScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.drivers", "./drivers/Chrome.exe");	
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		BufferedImage fullImage = ImageIO.read(screenshot);
		
		
		 // 3. Define dimensions of the particular area
        int xCoordinate = 100;
        int yCoordinate = 150;
        int width = 400;
        int height = 300;
		
        
        
        BufferedImage partialimage= fullImage.getSubimage(xCoordinate, yCoordinate, width, height);
        
     // Define where you want to save the final cropped image
        File outputFile = new File("./cropped_screenshot.png");

        // Save the image permanently to your project folder
        ImageIO.write(fullImage, "png", outputFile);
        
        
        
        driver.quit();
		
		
		
		
		

	}

}
