package Appium1Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class appium1Class {
	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("DeviceName","Galaxy A32");
		caps.setCapability("Udid","SM-A325F/DS");
		caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","12.0");
        
        
		caps.setCapability("appPackage","itg.jawwal.tawjihi");
		caps.setCapability("appActivity","itg.jawwal.tawjihi.MainActivity");
		caps.setCapability("noReset","true");
		try {
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("https://127.0.0.1:4723/wd/hub"),caps);
		}
		catch(MalformedURLException e){
			System.out.println(e.getMessage());
			
		}

		
	}

}
