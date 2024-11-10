public class PrimeNumbersBetween1To100 {
    public static void main(String[] args){
       int a= 1;
        while(a<=100){
          int num = a;
           int count =0;

    for(int i = 1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count == 2){
        System.out.println(num);
    }
    a++;
}
}
}
