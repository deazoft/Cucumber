import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class AwsTest {
    TestChrome testChrome = new TestChrome();

    @Given("I Navigate to (.*)")
    public void i_Navigate_to_http_aws_amazon_com_en(String url) {
        try {
            testChrome.Open(url);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("I go to Menu: My Account > Account Settings")
    public void i_go_to_Menu_My_Account_Account_Settings() {
        try {
            testChrome.Navigate();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("I enter the user (.*) and password (.*)$")
    public void i_enter_the_user_and_password_Mt(String email,String passwd) {
        testChrome.Login(email);
    }

    @Then("the page have a element id (.*)")
    public void the_page_have_a_element_id_ap_password(String id) {
        try {
            assertTrue(testChrome.ValidatePage(id));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
