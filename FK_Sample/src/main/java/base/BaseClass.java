package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	
	public static RemoteWebDriver driver;

	public static void launchApp() throws MalformedURLException {
		try {
			 DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("platformName", "android");
			    caps.setCapability("appium:deviceName", "OnePlus 9R");
			    caps.setCapability("appium:platformVersion", "12");
			    caps.setCapability("appium:automationName", "UiAutomator2");
			    caps.setCapability("appium:udid", "2220f649");
			    caps.setCapability("appium:appPackage", "com.flipkart.android");
			    caps.setCapability("appium:appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
			    URL url=new URL("http://127.0.0.1:4723/wd/hub");// appium server url
				driver=new RemoteWebDriver(url, caps);
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	   
	}

}
