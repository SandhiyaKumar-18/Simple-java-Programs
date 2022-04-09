package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author sandhya
 */
public class pyramidsir {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int i,n,j,s,x;
       System.out.println("Enter n:");
       n = sc.nextInt();
        s = 8;
        
        for( i=1; i<=n; i++) {
            for( x=s;x!=0;x--){
                System.out.print(" ");
            }
        
        for( j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
        s--;
        }
    }
}

