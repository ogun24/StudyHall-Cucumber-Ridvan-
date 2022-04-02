package guru99_insuranceProject.Pages;


import guru99_insuranceProject.Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
public BasePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
}
