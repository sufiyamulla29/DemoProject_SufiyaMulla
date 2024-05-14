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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private MobileElement titleProduct;

    /**
     * This method enters the username in text field
     *
     * @param name
     */

    public void enterUserName(String name){
        util.type(txtUserName,name);

    }

    /**
     *This method enters the password in text field
     * @param password
     */

    public void enterUserPassword(String password){
        util.type(txtUserPassword,password);

    }

    /**
     * This method clicks on login button
     */
    public void clickLogin(){
        util.click(btnClick);
    }

    /**
     * This method verifies if error message is displayed
     * @param orgErrMsg
     * @param text
     */
    public void verifyError(String orgErrMsg, String text ){
        util.exist(errMsg, text);

    }

    /**
     * This metod verifies if product page is displayed
     * @param product
     */
    public void verifyProduct(String product){
        util.exist(titleProduct, product);
    }

}
