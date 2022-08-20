package arrays;

import java.util.Arrays;

public class MultiDimensional3  {

    public static void main(String[] args) {
     String[] colorado= {"Telluride","Denver"};
   String[][] states={{"Tampa","Fort Lauderdale","Miami"},{"Chicago","Des Plaines"},
           {"New York"},{"Los Angeles","San Francisco"},colorado,{}} ;
//String[][] s = new String[3][5];
        System.out.println(Arrays.deepToString(states));

        states[3][0]="Paolo Alto";
        System.out.println(Arrays.deepToString(states));
 colorado[1]="Aspen";
        System.out.println(Arrays.deepToString(states));
states[4][0]="Vale";

        System.out.println(Arrays.toString(colorado));
//states[5][1]="New City"; Index out of bound exception
     //   states[6]= new String[2];
      //  System.out.println(Arrays.deepToString(states));
        // It will index out of bound exception
//     states[5][0]="Text";
        // Index out of bound exception because the length of the states[5] is 0
//        System.out.println(Arrays.deepToString(states));
//[[Tampa, Fort Lauderdale, Miami], [Chicago, Des Plaines],
// [New York], [Paolo Alto, San Francisco], [Telluride, Aspen], []]
// I want to print the state that has the city Chicago.
        System.out.println("We are going to print out state that has Chicago");
       OUTER: for (String[] innerState:states) {
        // If this array innerState contains Chicago
            for (String city:innerState) {
                if (city.equals("Chicago")){
                    System.out.println(Arrays.toString(innerState));
                    break OUTER;
                }
            }
        }

// Check all the states and print false if we don't have the los angeles
        // Print  Los Angeles if we have the los angeles
        System.out.println("======================================= \n");
        boolean didIPrint= false;
        for (String[] innerState:states
             ) {
           // System.out.println(Arrays.toString(innerState));
            // If I don't print anything after this loop it means that
            // I don't have the city Los Angeles
            for (String city:innerState) {
                if (city.equalsIgnoreCase("Los Angeles")){
                    System.out.println(city);
                    didIPrint=true;
                }
            }
        }
        // !didIPrint means the same  with didIPrint==false
        if (!didIPrint){
            System.out.println("false");
            System.out.println("I don't have los angeles ");
        }

//[[Tampa, Fort Lauderdale, Miami], [Chicago, Des Plaines],
// [New York], [Paolo Alto, San Francisco], [Telluride, Aspen], []]

// We need to print city name which has length bigger than 15
        // If there is no city name which has length bigger than 15
        // we should print city couldn't be found.
        boolean isThereCityLength=false;
        for (String[] innerState:states) {
            for (String city:innerState) {
                if(city.length()>15){
                    System.out.println(city);
                    isThereCityLength=true;
                }
            }
        }
        if (!isThereCityLength)
            System.out.println("City name couldn't be found");







    }













}
