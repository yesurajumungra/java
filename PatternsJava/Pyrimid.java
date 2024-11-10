import java.util.Scanner;
public class Pyrimid {
  
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int rows = scan.nextInt();
            int spaces=rows-1;
            int stars = 1;
           for(int i =1;i<=rows;i++){

            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++){
                System.out.print("*");
            }
            stars=stars+2;
            spaces--;
            System.out.println();
            

           }
        
    }
}
