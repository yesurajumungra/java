
public class AutomorphicNumber {
    public static void main(String args[]){
        for(int i =1;i<=1000;i++){
        int num = i;
        int square = num *num;
        boolean isAutomorphic = true;
        
        while(num>0){
            int ld1= num%10;
            int ld2 = square%10;

            if(ld1!=ld2){
                isAutomorphic = false;
                break;
            }
            num = num/10;
            square = square/10;
        }
        if(isAutomorphic == true){
            System.out.println(i+" automorphic number");
        }
        
    }
    }
}
