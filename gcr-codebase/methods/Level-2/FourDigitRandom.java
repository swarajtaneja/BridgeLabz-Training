import java.util.Scanner;
import java.lang.Math;
public class FourDigitRandom {
    public static int[] generate4DigitRandomArray()
    { 
      int[] array= new int[5];
      for(int i=0;i<5;i++)
      {
            int min = 1000;
            int max = 9999;
            int randomNum = (int)(Math.random() * (max - min + 1)) + min;
            array[i]= randomNum; 
      }
      return array;
    }
    public static int[] findAverageMinMax(int[] array)
    { 
      int[] newArray =new int[3];
      int sum=0,minimum=array[0],maximum=array[0];
      for(int i =0;i<array.length;i++)
      {
          sum+=array[i];
      }
      newArray[0]=sum/array.length;
      for(int i=1; i<array.length; i++)
	{
	    if(array[i] > maximum)
		maximum = array[i];
	    if(array[i] < minimum)
		minimum = array[i];
	}
      
      newArray[1]=minimum;
      newArray[2]=maximum;
      return newArray;
    }
    

    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
	
        int[] array=generate4DigitRandomArray();
        int [] newArray =findAverageMinMax(array);
        System.out.println("Avaerage of five 4 digits number :"+newArray[0]);
        System.out.println("Minimum value in Five Numbers"+newArray[1]);
        System.out.println("Maximum value in Five Numbers"+newArray[2]);
                                                 }
                                 }