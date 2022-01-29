package Day4;

public class LoopArrayConditions {
    public static void main(String[] args) {
        //create a dynamic array for 4 different cities, iterate through the values but only print when city
        //either Brooklyn or Bronx
        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Bronx";
        cities[2] = "Queens";
        cities[3] = "Manhattan";

        int i = 0;
        while (i < cities.length) {
            //two if conditions
            if (cities[i] == "Bronx") {
                System.out.println("City is " + cities[i]);
            } else if (cities[i] == "Manhattan") {
                System.out.println("City is " + cities[i]);
            }//End of conditions
            i++;
        }//End of while loop
    }//End of Main
}//End of Class

