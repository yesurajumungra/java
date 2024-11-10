import java.util.*;
public class Pattern2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No Of rows:");
        int rows= scan.nextInt();
        System.out.println("No Of colummns:");
        int colummns = scan.nextInt();
        
        for(int i = 1; i<=rows;i++){                      

            for(int j =1;j<=colummns;j++){
                 
                if(j == 5 && i==3){
                    System.out.print("@");
                  
                }
                else if(i ==4 && j==2){
                      System.out.print("#");
                }
                else{
                System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}