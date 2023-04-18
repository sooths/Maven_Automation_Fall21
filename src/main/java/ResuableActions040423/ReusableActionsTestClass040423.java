package ResuableActions040423;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.WebDriver;

public class ReusableActionsTestClass040423 {
    public static void main(String[] args) {

        //declare the webdriver and define it from the reusable actions
        WebDriver driver = ReusableActions040423.setUpDriver();
        //navigate to metlife home page
        driver.navigate().to("https://www.metlife.com/");
        //click on solutions tab
        ReusableActions040423.clickAction(driver, "//*[contains(text(), 'SOLUTIONS')]", "SolutionsTab");
        //click on dental link
        ReusableActions040423.clickAction(driver, "//*[text() =  'Dental']", "DentalLink");
        //get the title from dental page
        String dentalPageTitle = ReusableActions040423.getText(driver, "//*[@class = 'headline__title']", "DentalPageTitle");
        //print the product list
        System.out.println("Dental Page Title Is: " + dentalPageTitle);
    }
}