package guru99_insuranceProject.steps_Definations;

import guru99_insuranceProject.Utils.Driver;
import guru99_insuranceProject.Utils.PropertiesReadingUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import javax.security.auth.login.Configuration;

public class Hooks {
@Before
    public void setUp(){
    Driver.getDriver().manage().window().maximize();
    Driver.getDriver().get(PropertiesReadingUtil.getProperties("environmentURL"));
}
@After
    public void tearDownDriver(){
    Driver.closeDriver();
}
}
