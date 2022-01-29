package Day3;

public class ReturnMethod {public static void main(String[] args) {
    int a = 2;
    int b = 4;

    int value = ReusableMethod.addReturn(a,b);

    System.out.println("New result is " +(value+200));

}//end of main
}
