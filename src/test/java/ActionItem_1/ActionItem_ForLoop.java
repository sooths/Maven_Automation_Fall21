public class ActionItem_ForLoop {public static void main(String[] args) {
    //iterate through all boroughs defined by dynamic array using for loop
    String[] zipcode = new String[4];
    zipcode[0] = "11373";
    zipcode[1] = "12738";
    zipcode[2] = "38383";
    zipcode[3] = "93391";


    //integer dynamic array
    int[] streetNumber = new int[4];
    streetNumber [0] = 200;
    streetNumber [1] = 400;
    streetNumber [2] = 500;
    streetNumber [3] = 600;

    for (int i=0; i < zipcode.length; i++){
        //print statement
        System.out.println("My zipcode is " + zipcode [i] + " my streetNumber is " + streetNumber[i]);
    }//end of for loop
}//end of main
}//end of java class


