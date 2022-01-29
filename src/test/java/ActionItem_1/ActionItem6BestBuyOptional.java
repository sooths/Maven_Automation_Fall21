package ActionItem_1;

import Day9.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ActionItem6BestBuyOptional {
    //Use reusable method for each steps:

    //1. Navigate to www.bestbuy.com
    //2. Verify title page contains “Best Buy | Official Online Store”
    //3. Close the pop-up
    //4. Click on search field
    //5. Write laptop name on search field and click on search button
    //6. Add laptop to the cart
    //7. Click on go to cart
    //8. Click on checkout
    //9. Click in ‘continue as Guest’
    //10. Fill out shipping Information
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = ReusableActions.setDriver();
    } //end of precondition


    @Test(priority = 1)
    public void huluSearchLoop() {
        ArrayList<String> laptop = new ArrayList<>();
        laptop.add("HP Laptop");
        laptop.add("Macbook");

        ArrayList<String> firstname = new ArrayList<>();
        firstname.add("Arif");
        firstname.add("Syed");

        ArrayList<String> lastname = new ArrayList<>();
        lastname.add("Islam");
        lastname.add("Lig");

        ArrayList<String> address = new ArrayList<>();
        address.add("7911 41st Ave");
        address.add("4640 46st");

        ArrayList<String> city = new ArrayList<>();
        city.add("Elmhurst");
        city.add("Jackson Heights");

        ArrayList<String> state = new ArrayList<>();
        state.add("NY");
        state.add("NJ");

        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11373");
        zipcode.add("11372");

        ArrayList<String> email = new ArrayList<>();
        email.add("ariful.islam42@gmail.com");
        email.add("ariful.islam422@gmail.com");

        ArrayList<String> phonenumber = new ArrayList<>();
        phonenumber.add("1234567890");
        phonenumber.add("2345678901");

        //navigating to hulu
        driver.navigate().to("https://www.bestbuy.com");
        driver.manage().window().fullscreen();
        for (int i = 0; i < laptop.size(); i++) {

            //verify the welcome page title appears as expected
            String actualTitle = driver.getTitle();

            //by using if else to compare expected with actual title
            if (actualTitle.equals("Best Buy | Official Online Store | Shop Now & Save")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }
            //close popup
            ReusableActions.clickMethod(driver, "//*[@class='c-close-icon c-modal-close-icon']", "Close Pop-Up");
            //click on search
            ReusableActions.clickMethod(driver, "//*[@id='gh-search-input']", "Click Search Box");
            //enter laptopname
            ReusableActions.sendKeysMethod(driver, "//*[@id='gh-search-input']", laptop.get(i), "Laptop");
            //click search
            ReusableActions.clickMethod(driver,"//*[@class='header-search-button']","Enter");
            //add laptop to the cart
            ReusableActions.clickMethod(driver, "//*[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button']", "Click Add To Cart");
            //go to cart
            ReusableActions.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-sm c-button-block ']","Go to Cart");
            //go to checkout
            ReusableActions.clickMethod(driver,"//*[@class='checkout-buttons__checkout']","Checkout");
            //checkout as guest
            ReusableActions.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']","Continue As Guest");
            //click guest
            //enter first name
            ReusableActions.sendKeysMethod(driver,"//*[@id='firstName']", firstname.get(i),"First Name");
            //enter last name
            ReusableActions.sendKeysMethod(driver,"//*[@id='lastName']",lastname.get(i),"Last Name");
            //address
            ReusableActions.sendKeysMethod(driver,"//*[@class='tb-input  autocomplete__input']", address.get(i),"Address");
            //city
            ReusableActions.sendKeysMethod(driver,"//*[@id='city']", city.get(i),"City");
            //state
            ReusableActions.clickMethod(driver,"//*[@class='tb-select-wrapper c-dropdown']","Select State");
            ReusableActions.selectMethod(driver,"//*[@id='state']",state.get(i),"Select State");
            //zipcode
            ReusableActions.sendKeysMethod(driver,"//*[@id='zipcode']",zipcode.get(i),"zipcode");
            //email
            ReusableActions.sendKeysMethod(driver,"//*[@id='user.emailAddress']",email.get(i),"Email");
            //phonenumber
            ReusableActions.sendKeysMethod(driver,"//*[@id='user.phone']",phonenumber.get(i),"Number");

            //delete cookies

        }//end of forloop
    } //end of class
        @AfterSuite
        public void endSession () {
            driver.quit();
        }
    }


