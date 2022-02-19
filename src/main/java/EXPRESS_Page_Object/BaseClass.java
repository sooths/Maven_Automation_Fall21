package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class
    //create static reference for usps home page

    public static Homepage homepage(){
        Homepage homepage = new Homepage(driver);
        return  homepage;
    }

    //create static reference for send mail and packages page
    public static Dresses dresses(){
        Dresses dresses = new Dresses(driver);
        return  dresses;
    }
    public static Size sizes() {
        Size sizes = new Size(driver);
        return sizes;

    }

    public static Quantity quantities() {
        Quantity quantities = new Quantity(driver);
        return quantities;

    }

    public static Info infos() {
        Info infos = new Info(driver);
        return infos;


    }

}


