import java.util.*;
public class Pattern3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No Of rows:");
        int rows= scan.nextInt();
        System.out.println("No Of colummns:");
        int colummns = scan.nextInt();
        
        
        for(int i = 1; i<=rows;i++){                      

            for(int j =1;j<=colummns;j++){

                if (i+j ==6 ){       //if rows= 5, colummns = 5
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }

            }
            
            System.out.println();
        }
    }
}