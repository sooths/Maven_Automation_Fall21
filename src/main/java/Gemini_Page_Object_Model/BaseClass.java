package Gemini_Page_Object_Model;

import EXPRESS_Page_Object.Dresses;
import EXPRESS_Page_Object.Homepage;
import EXPRESS_Page_Object.Size;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //end of constructor class
    //create static reference for Gemini home page
   public static NewAccount newAccount(){
        NewAccount newAccount = new NewAccount(driver);
        return  newAccount;
    }

    //create static reference for send mail and packages page
    public static BusinessAccount businessAccount(){
        BusinessAccount businessAccount = new BusinessAccount(driver);
        return  businessAccount;
    }


    }



