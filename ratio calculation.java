/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javasimpleprograms;
import java.util.Scanner;
/**
 *
 * @author sandhya
 */
public class ratio {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
//------------------------------------ Getting the size of the array------------------------------------------    
        System.out.println("Enter the number of elements you want to enter:");
        int elem = sc.nextInt();
        
        int [] arr = new int[elem];
        
// --------------------------------getting input ---------------------------------------------       
        System.out.println("Enter elements:");
        for(int i=0;  i<elem; i++){
           arr[i] = sc.nextInt(); 
        }
        
        
// ----------------------------just trying to print the numbers in the array--------------------------------------------------
         System.out.println("Array is ");
         for(int i=0;  i<elem; i++){
           System.out.println(arr[i]); 
        }
        
// ------------------------- finding pos,neg,zero elems----------------------------------------------------       
         float pos = 0;
         float neg = 0;
         float zero = 0;
           for(int i=0;  i<elem; i++){
           if(arr[i]>=0){
               if(arr[i]==0){
               zero++;
               System.out.print(arr[i]);
           }
               else{
                   pos++;
               }
           }
           
           else {
               neg++;
           }
           
        }
       
//   ----------------------printing ratios---------------------------------------------------------------------------------------     
         System.out.println();
         System.out.printf("%1.6f",pos/arr.length);
         System.out.println();
         System.out.printf("%1.6f",neg/arr.length);
         System.out.println();
         System.out.printf("%1.6f",zero/arr.length);
         System.out.println();
    }
}
