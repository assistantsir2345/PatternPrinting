package Specialpatterns;
import java.util.Scanner;
public class oddEvenTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){  //row
            for(int j=1;j<=i;j++){  //cols
                System.out.print(2*j-1 +" ");
                
            }
            System.out.println();
        }   
            
    }
    
}