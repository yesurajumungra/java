public class ReflectionOfFirstQuadrant{
    public static void main(String[] args) {
        int stars = 1;
        for(int i =1;i<=9;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<5){
                stars++;
            }
            else{
                stars--;
            }
            System.out.println();
        }
    }
}