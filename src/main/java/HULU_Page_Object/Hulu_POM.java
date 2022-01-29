package HULU_Page_Object;

import Reusable_Library.Reusable_Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_POM extends Reusable_Actions {
    @Test(priority = 1)
    public void huluSearchLoop() {
        ArrayList<String> email = new ArrayList<>();
        email.add("dsnkkdsnd@gmail.com");
        email.add("sdksdjjksd@gmail.com");

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
            BaseClass.homepage().GetHuluPlan();
            BaseClass.info().Email("jfiijfdjidfjfdiifj@gmail.com");
            BaseClass.info().Password("kdkdslkdsdkl");
            BaseClass.info().FirstName("Arjkjss");
            BaseClass.info().Birthmonth();
            BaseClass.info().Birthmonths("June");
            BaseClass.info().Birthday();
            BaseClass.info().Birthdays("3");
            BaseClass.info().Birthyear();
            BaseClass.info().Birthyears("1999");
            BaseClass.info().Gender();
            BaseClass.info().Genders("male");
            BaseClass.info().Continue();
            BaseClass.capture().Capture();
            BaseClass.capture().Capture2();
        }
    }
            @Test(dependsOnMethods = "huluSearchLoop")
            public void huluSearchLoops () {
        //test
                //navigate to Hulu
                driver.navigate().to("http://www.hulu.com");
                BaseClass.info2().Login();
                BaseClass.info2().Email("ariful.islam42@gmail.com");
                BaseClass.info2().Password("Camry2020!");
                BaseClass.info2().ClickLogin();
                BaseClass.verify().Verify();
            }
        }
