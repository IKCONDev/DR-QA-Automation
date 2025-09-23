package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;

import Registrar.obj.Registrar_close_Obj;
import io.cucumber.java.en.Then;

public class Registrar_close_step {

	WebDriver driver = Driver.getDriver();
	Registrar_close_Obj Rco = new  Registrar_close_Obj(driver);
	
	 @Then("Registrar Can Check  close funcionality")
		public void Registrar_can_Check_logoutClose_funcionality() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Rco.Registrar_can_Check_logoutClose_funcionality();
			
			
			
			}

}
