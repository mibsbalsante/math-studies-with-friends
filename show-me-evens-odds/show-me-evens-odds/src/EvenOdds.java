import java.util.*;
public class EvenOdds{
   public static void main(String[] args){
   
   System.out.println("Pick a number, any number.");
   Scanner sc = new Scanner(System.in);
   int input = sc.nextInt();
   
      //Even Check
      if( input % 2 == 0){
         for(int i = 0; i < input; i++){
            if(i % 2 == 0){
               System.out.print(i + ",");
            }
         }
      }
      
      //Odd Check 
      if( input % 2 != 0){
         for(int i = 0; i < input; i++){
            if(i % 2 != 0){
               System.out.print(i + ",");
            }
         }
      }

   }
}