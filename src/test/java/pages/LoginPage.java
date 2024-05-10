package pages;

import DriverManager.AppiumDriverManager;
import base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

import java.time.Duration;

public class LoginPage extends BaseTest {

    Utility util ;
    public LoginPage(){
        util  = new Utility();
        PageFactory.initElements(new AppiumFieldDecorator(AppiumDriverManager.getInstance().getDriver(), Duration.ofSeconds(10L)),this);
    }

    @AndroidFindBy(accessibility = "test-Username")
    private MobileElement txtUserName;

    @AndroidFindBy(accessibility = "test-Password")
    private MobileElement txtUserPassword;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private MobileElement btnClick;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]//child::android.widget.TextView")
    private MobileElement errMsg;

    //android.widget.TextView[@text="Username and password do not match any user in this service."]

    //android.view.ViewGroup[@content-desc="test-Error message"]//child::android.widget.TextView

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private MobileElement titleProduct;


    public void enterUserName(String name){
        util.type(txtUserName,name);

    }

    public void enterUserPassword(String password){
        util.type(txtUserPassword,password);

    }

    public void clickLogin(){
        util.click(btnClick);
    }

    public void verifyError(String orgErrMsg, String text ){
        util.exist(errMsg, text);

    }

    public void verifyProduct(String product){
        util.exist(titleProduct, product);
    }

}
