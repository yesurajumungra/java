public class NoOfPrimeNumbersIn1To100 {
    public static void main(String[] args){
        int a= 1;
        int count1=0;

        while(a<=100){
          int num = a;
           int count =0;

    for(int i = 1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count == 2){
        
       // System.out.println(num);
       count1++;
    }
    a++;
}
System.out.println(count1);
}
}
