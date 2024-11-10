import java.util.Scanner;
class Qudrant3{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int colummns = scan.nextInt();

        for(int i =1;i<=rows;i++){
            for(int j =1;j<=colummns;j++){
                if(i<=j){
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