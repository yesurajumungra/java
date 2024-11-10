public class TechNumber {
    public static void main(String args[]){
        int num =81;
        int temp = num;
        int count =0;

        while(num>0){
            num= num/10;
            count++;
        }
        if(count%2==0){
        int exp=1;
        for(int i=1;i<=(count/2);i++){
            exp = exp*10;
        }
           int sum =0;
           int firstHalf= temp/exp;
           int secondHalf = temp%exp;
            sum=firstHalf+secondHalf;
         int square= sum*sum;

        if(square == temp){
            System.out.println(temp+" is an tech number");
        }
        else{
            System.out.println(temp+" is not an tech number");
        }
    }
    else{
        System.out.println(temp+" is not an tech number");
    }
    

    }
}
