package guru99_insuranceProject.Pages;

import guru99_insuranceProject.Utils.CommonUtils;
import guru99_insuranceProject.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "email")
    private WebElement email;
    @FindBy(xpath = "//a[.='Register']")
    private WebElement register;

    public void setRegister(){
        CommonUtils.clickWithWait(register);
    }
}
