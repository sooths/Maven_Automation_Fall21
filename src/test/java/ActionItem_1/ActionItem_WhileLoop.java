package ActionItem_1;

public class ActionItem_WhileLoop {public static void main(String[] args) {
    //iterate through all boroughs defined by dynamic array using while loop
    String[] zipcode = new String[4];
    zipcode[0] = "11373";
    zipcode[1] = "11103";
    zipcode[2] = "11101";
    zipcode[3] = "11372";



    //integer dynamic array
    int[] houseNumber = new int[4];
    houseNumber [0] = 200;
    houseNumber [1] = 400;
    houseNumber [2] = 500;
    houseNumber [3] = 600;

    //declare and define the initial starting point
    int i = 0;
    //define while loop with your end point (condition)
    while(i< houseNumber.length){
        System.out.println("My zipcode is " + zipcode [i] + " my streetNumber is " + houseNumber[i]);
        i = i+1;
        //if there is no incrementation, the while loop becomes infinite loop
    }//end of while loop
}//end of main
}//end of java class


