public class ReflectionOfFourthQuadrant {
    public static void main(String[] args) {
        int spaces = 4;
        int stars =1;
        for(int i =1;i<=9;i++){
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=stars;k++){
                System.out.print("*");
            }
            if(i<5){
                spaces--;
                stars++;
            }
            else{
                spaces++;
                stars--;
            }
            System.out.println();
        }
    }
}
