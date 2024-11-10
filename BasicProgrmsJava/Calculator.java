import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){

         
          Scanner scan = new Scanner(System.in);
         System.out.println("Enter your first no :");
         double a = scan.nextDouble();

         System.out.println("Enter your first no :");
         double b = scan.nextInt();
         double c;
         System.out.println("enter your operation :");
         System.out.println("For Addition : +");
         System.out.println("For subraction : -");
         System.out.println("For multipiclation : x");
         System.out.println("For division : /");
         String operation = scan.next();

          switch (operation){
              
            case "+":
            {
                System.out.println("Addition");
                c = a+b;
                System.out.println(a+"+"+b+" = "+c);
                break;
            }
            case "x":
            {
                System.out.println("Muntlipulcation");
                c = a*b;
                System.out.println(a+"*"+b+" = "+c);
                break;
            }
            case "-":
            {
                System.out.println("subraction");
                c = a-b;
                System.out.println(a+"-"+b+" = "+c);
                break;
            }
            case "/":
            {
                System.out.println("division");
                c = a/b;
               double r= a%b;
                System.out.println(a+"/"+b);
                System.out.println("quotient is :"+c);
                System.out.print("reaminder is :"+r);
                break;
            
            }

          }

    }
}
