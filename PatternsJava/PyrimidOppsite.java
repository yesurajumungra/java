import java.util.Scanner;
public class PyrimidOppsite {
  
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        
      
        int stars = 9;;
        int spaces=0;
        
       for(int i =1;i<=5;i++){

        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=stars;k++){
            System.out.print("*");
        }
        stars=stars-2;
        spaces++;
        System.out.println();
        

       }
    
}
}
