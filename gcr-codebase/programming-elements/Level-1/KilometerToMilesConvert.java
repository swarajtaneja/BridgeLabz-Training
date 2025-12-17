/*
 *Create a program to convert the distance of 10.8 kilometers to miles
 *Hint: 1 km = 1.6 miles.
 *Creating a public Class with name KilometerToMilesConvert.
 */
public class KilometerToMilesConvert{

    public static void main(String[] args){

        //Creating a double variable with name distanceInKilometer and assigning the value 10.8.
        double distanceInKilometer = 10.8;

        //Creating a double variable with name distanceInMiles and assigning the value 1.6.
        double distanceInMiles = 1.6;

        /*
         *Creating a double variable with name newMiles and calculating the age.
         *Use of multiplication operator (*)
        */
        double newMiles = (distanceInKilometer * distanceInMiles);
        
        //Displaying the result in miles.
        System.out.println("The distance " + distanceInKilometer + " km in miles is " + newMiles); 
                                          }
                }