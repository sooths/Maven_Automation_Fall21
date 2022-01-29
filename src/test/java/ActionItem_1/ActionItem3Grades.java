package ActionItem_1;

public class ActionItem3Grades {
    public static void main(String[] args) {
        //define the integer variables

        int grade = 35;
        if (grade >= 90 && grade <= 100) {
            System.out.println("grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.print("grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.print("grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.print("grade is D");
        } else {
            System.out.print("grade is F");
        }
    }
}


