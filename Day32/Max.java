// Find the max number in the array
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {


   
   int[] ar=new int[30];
Scanner sc=new Scanner(System.in);
        

   
    try{
        
        System.out.println("Enter the Maximum number");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
         ar[i] = sc.nextInt(); 
        }
        // getting array length
          int max = ar[0];  
        //Loop through the array  
        for (int i = 0; i < a; i++) {  
            //Compare elements of array with max  
           if(ar[i] > max)  
               max = ar[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
        System.exit(0);
    } catch (NumberFormatException nfe) {  //if the input is not a number here it will catch the exception
       
     System.out.println(" is not a valid input");
    
  }
}
}
