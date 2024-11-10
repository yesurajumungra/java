import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No Of rows:");
        int rows= scan.nextInt();
        System.out.println("No Of colummns:");
        int colummns = scan.nextInt();
        
        for(int i = 1; i<=rows;i++){                       // no of rows

            for(int j =1;j<=colummns;j++){             // no of colummns
                System.out.print("*");
            }

            System.out.println();
        }
    }
}