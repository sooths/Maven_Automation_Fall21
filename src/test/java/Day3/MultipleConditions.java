package Day3;

public class MultipleConditions {
    public static void main(String[] args) {
        
        //define the set of variables
        int a = 1;
        int b = 3;
        int c = 4;

        //verify a+b >c, a+b < c or a+b == c
        if (a+b > c) {
            System.out.print("a & b is greater than c");
        } else if (a+b <c) {
            System.out.print("a & b is less than c");
        } else {
            System.out.print("a & b is equal to c");
        }

        }//end of main
    }// end of java class
