public class NumberPattern {
    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j =1;j<=5;j++){
                if(i>=j){
                    System.out.print(num+" ");
                    num++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
