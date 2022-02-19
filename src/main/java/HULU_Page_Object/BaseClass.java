package HULU_Page_Object;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class
    //create static reference for hulu home page

    public static Homepage homepage(){
        Homepage homepage = new Homepage(driver);
        return  homepage;
    }

    public static Info info(){
        Info info = new Info(driver);
        return  info;
    }

    public static Capture capture(){
        Capture capture = new Capture(driver);
        return  capture;
    }

    public static Info2 info2(){
        Info2 info2 = new Info2(driver);
        return  info2;
    }
    public static Verify verify(){
        Verify verify = new Verify(driver);
        return  verify;
    }

}
