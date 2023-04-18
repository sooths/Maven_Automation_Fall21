package ResuableActions040423;

import org.openqa.selenium.WebDriver;

public class MortgageCalculator {
    public static void main(String[] args) {
        //declare the webdriver and define it from the reusable actions
        WebDriver driver = ReusableActions040423.setUpDriver();
        //go to mortgage calculator homepage
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //enter home value
        ReusableActions040423.sendKeysAction(driver, "//*[@id  = 'homeval']", "850000", "HomeValue");
        //enter down payment
        ReusableActions040423.sendKeysAction(driver, "//*[@id  = 'downpayment']", "150000", "DownPayment");
        //click on calculate button
        ReusableActions040423.clickAction(driver, "//*[@value = 'Calculate']", "CalculateButton");
        //capture the monthly payment
        String monthlyPayment = ReusableActions040423.getText(driver, "//*[@class= 'left-cell']/h3", "MonthlyPayment");
        //print the monthly payment
        System.out.println("The monthly payment is " + monthlyPayment);
        //quit the driver
        driver.quit();
    }
}
