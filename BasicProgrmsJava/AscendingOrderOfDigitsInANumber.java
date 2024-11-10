public class AscendingOrderOfDigitsInANumber {
    public static void main(String args[]){

        int ref=0;

        for(int i =1; i<=9;i++){
        int num =3478622;
        while(num>0){
            int ld = num%10;
            if(ld==i){
                ref=ref*10+ld;
                //break;
            }
            num=num/10;
        }
    }
    System.out.println(ref);
    }
    
}
