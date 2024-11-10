public class Diamond{
    public static void main(String args []){
        int spaces = 3;
        int stars =1;
        for(int i =1;i<=7;i++){
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=stars;k++){
                System.out.print("*");}

            if(i<4){
                stars+=2;
                spaces-=1;
            }
            else{
                stars-=2;
                spaces+=1;
            }

        
        System.out.println();
    }
}
}