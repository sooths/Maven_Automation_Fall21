package Day4;

public class SplitMethod {
    public static void main(String[] args) {
        //create a single string
        String statement = "My name is John" ;
        //declare String array to split the message to print out only John
        String [] arrayMessage = statement.split("" );

        //print out John
        System.out.println("result is " + arrayMessage[3]);
    } //end of main
} //end of java class
