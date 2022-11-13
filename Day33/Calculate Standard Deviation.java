Calculate Standard Deviation


import java.util.Scanner;
public class Main {

  public static void main(String[] args) {


   
   int[] arr=new int[30];
Scanner sc=new Scanner(System.in);
        

   
    try{
         double sum = 0.0;
    double standardDeviation = 0.0;
    double mean = 0.0;
    double res = 0.0;
    double sq = 0.0;
        System.out.println("Enter the Maximum number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
         arr[i] = sc.nextInt(); 
        }
       for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
       
        mean = sum / (n);
 
        for (int i = 0; i < n; i++) {
           
            standardDeviation
                = standardDeviation + Math.pow((arr[i] - mean), 2);
           
        }
       
        sq = standardDeviation / n;
        res = Math.sqrt(sq);
          System.out.format("Standard Deviation = %.6f", res);
        System.exit(0);
    } catch (NumberFormatException nfe) {  //if the input is not a number here it will catch the exception
       
     System.out.println(" is not a valid input");
    
  }
}
}
