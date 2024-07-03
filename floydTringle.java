package Specialpatterns;
import java.util.Scanner;
public class floydTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        
        int a = 1;
        for(int i=1;i<=n;i++){  //row
            for(int j=1;j<=i;j++){  //cols
                System.out.print(a++  +" ");
                
            }
            System.out.println();
        }   
            
    }

    
}
