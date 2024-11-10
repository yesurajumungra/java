public class PatternNumbers {
    public static void main(String[] args) {
        int spaces = 3;
        int stars =1;
        
        for(int i =1;i<=7;i++){
             int num=1;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
                }
                
                for(int k=1;k<=stars;k++){
                    System.out.print(num);
                    num++;
                }
                
                if(i<4){
                    stars=stars+2;
                    spaces--;
                }
                else{
                    stars = stars-2;
                    spaces++;
                  }
                  
            System.out.println();
            
        }
    }
}
