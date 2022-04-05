package java;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sandhiya
 */
public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter five numbers:");
        int [] arr = new int [5];
        for (int i=0;i<5; i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("Sorted array:");
       for (int i=0;i<arr.length; i++){
           for ( int j=i+1; j<arr.length; j++ ){
           if (arr[i]<arr[j]){
           temp =arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
           
           }
    
     System.out.println(arr[i]+" ");
       }
    

}
}
