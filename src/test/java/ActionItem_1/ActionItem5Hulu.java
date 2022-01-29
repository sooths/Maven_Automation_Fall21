package ActionItem_1;

import Reusable_Library.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ActionItem5Hulu extends Reusable_Actions {
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Day9.ReusableActions.setDriver();
    }//end of precondition

    @Test(priority = 1)
    public void huluSearchLoop() {
        ArrayList<String> email = new ArrayList<>();
        email.add("skdkjdskjs@gmail.com");
        email.add("sjdksdkdsj@gmail.com");

        ArrayList<String> pass = new ArrayList<>();
        pass.add("Camry2020!");
        pass.add("y0l0swag1234");

        ArrayList<String> name = new ArrayList<>();
        name.add("Ariful Syed Islam");
        name.add("Ariful Syed Islam Mahim");

        ArrayList<String> month = new ArrayList<>();
        month.add("June");
        month.add("July");

        ArrayList<String> day = new ArrayList<>();
        day.add("3");
        day.add("4");

        ArrayList<String> year = new ArrayList<>();
        year.add("1999");
        year.add("2000");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("male");
        gender.add("female");

        for (int i = 0; i < email.size(); i++) {


            //navigating to hulu
            driver.navigate().to("https://www.hulu.com");
            driver.manage().window().fullscreen();
            //entering a unique keyword from array list
            //ReusableActions.sendKeysMethod(driver,"//*[@name='q']",cars.get(i),"Search Field");

            //verify the welcome page title appears as expected
            String actualTitle = driver.getTitle();

            //by using if else to compare expected with actual title
            if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            //scroll method
            Day9.ReusableActions.scrollByPixelMethod(driver, "0", "3500", "scroll");
            //select Hulu plan
            Day9.ReusableActions.clickMethod(driver, "//*[@aria-label= 'Get Hulu plan']", "click on Select button");

            //enter email
            Day9.ReusableActions.sendKeysMethod(driver, "//*[@id= 'email']", email.get(i), "Email");

            //enter password
            Day9.ReusableActions.sendKeysMethod(driver, "//*[@id= 'password']", pass.get(i), "Password");

            //enter name
            Day9.ReusableActions.sendKeysMethod(driver, "//*[@id= 'firstName']", name.get(i), "Name");

            //select value from birth month
            Day9.ReusableActions.clickMethod(driver, "//*[@class = 'selector-selected input__text placeholder']", "Birthmonth");
            Day9.ReusableActions.selectMethod(driver, "//*[@id = 'birthdayMonth-menu']", month.get(i), "Birthmonth");
            //select value from birthday
            Day9.ReusableActions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthday");
            Day9.ReusableActions.selectMethod(driver, "//*[@id= 'birthdayDay-menu']", day.get(i), "Birthday");

            //select value from birth year
            Day9.ReusableActions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthdayyear");
            Day9.ReusableActions.selectMethod(driver, "//*[@id = 'birthdayYear-menu']", year.get(i), "Birthdayyear");

            //select value from gender
            Day9.ReusableActions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Gender");
            Day9.ReusableActions.selectMethod(driver, "//*[@id ='gender-menu']", gender.get(i), "Male");

            //click Continue
            Day9.ReusableActions.clickMethod(driver, "//*[@class='button button--continue ']", "Continue");

            //capture text $0.00
            String result = Day9.ReusableActions.getTextMethod(driver, "//*[@class= 'ledger__price']", "$6.99");
            System.out.println("The amount is " + result);

            String results = Day9.ReusableActions.getTextMethod(driver, "//*[@class= 'summary__price']", "$0.00");
            System.out.println("The amount is " + results);

            //delete cookies
            driver.manage().deleteAllCookies();
        } //end of forloop
    }//end of test1

    @Test(dependsOnMethods = "huluSearchLoop")
    public void Login() {
        driver.navigate().to("https://www.hulu.com");
        driver.manage().window().fullscreen();
        Day9.ReusableActions.clickMethod(driver, "//*[text()='Log In']", "click Login");
        Day9.ReusableActions.sendKeysMethod(driver, "//*[@id='email_id']", "ariful.islam42@gmail.com", "enter Email");
        Day9.ReusableActions.sendKeysMethod(driver, "//*[@id='password_id']", "Camry2020!", "enter Password");
        Day9.ReusableActions.clickMethod(driver, "//*[@class='jsx-4282396490 button-dark login-button']", "clicking on login button");
        String username = Day9.ReusableActions.getTextMethod(driver, "//*[text()='Ariful Islam']", "Ariful Islam");
        System.out.println("The username is " + username);
        //end of test 2
    }
}
