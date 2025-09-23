package Registrar.obj;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigWriter;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Registrar_close_Obj extends Baseclass {
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();
	public Registrar_close_Obj(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	public void Registrar_can_Check_logoutClose_funcionality() throws Exception {
		Thread.sleep(10000);
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		 
		// Close the first tab (index 0)
		driver.switchTo().window(tabs.get(0));
		driver.close();
		 
		// Switch back to the active tab (now index 1)
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(10000);
		driver.get("https://drcit.idrbt.ac.in/#/rgnt-dshd");
		
	}
 
	
    
   
}
