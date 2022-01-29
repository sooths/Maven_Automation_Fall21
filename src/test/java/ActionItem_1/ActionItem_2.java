package ActionItem_1;

public class ActionItem_2 {public static void main(String[] args) {
    //iterate through all boroughs defined by dynamic array using while loop
    String[] zipcode = new String[4];
    zipcode[0] = "11373";
    zipcode[1] = "11103";
    zipcode[2] = "11101";
    zipcode[3] = "11372";



    //integer dynamic array
    int[] streetNumber = new int[4];
    streetNumber [0] = 200;
    streetNumber [1] = 400;
    streetNumber [2] = 500;
    streetNumber [3] = 600;
    System.out.println("My zipcode is " + streetNumber[3]);

    //declare and define the initial starting point
    int i = 0;
    //define while loop with your end point (condition)
    while(i< zipcode.length){System.out.println("My current zipcode is " + zipcode [i] + " My street number is " + streetNumber[i]);
        i=i+0; //if there is no incrementation, the while loop becomes infinite loop
    }//end of while loop
}//end of main
}//end of java class


