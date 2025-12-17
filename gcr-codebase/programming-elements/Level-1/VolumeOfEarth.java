public class VolumeOfEarth{

    public static void main(String[] args){

        int radiusOfEarth = 6378;

        int radiusCube =(int) Math.pow(radiusOfEarth,3);
        
        double volumeOfSphere = (4/3) * 3.14 * radiusCube ;

        double volumeInMiles = volumeOfSphere * 1.6;
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfSphere +" and cubic miles is " + volumeInMiles ); 
                                          }
                }