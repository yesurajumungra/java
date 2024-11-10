
    import java.util.*;
public class PatternNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No Of rows:");
        int rows= scan.nextInt();
        System.out.println("No Of colummns:");
        int colummns = scan.nextInt();
        int count=1;
        
        for(int i = 1; i<=rows;i++){                       // no of rows

            for(int j =1;j<=colummns;j++){             // no of colummns
                System.out.print(count+"\t");
                count++;
            }

            System.out.println();
        }
    }
}

