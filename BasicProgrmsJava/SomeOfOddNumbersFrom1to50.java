public class SomeOfOddNumbersFrom1to50 {
    public static void main(String[] args) {
        int sum= 0;
        for(int i = 1; i<=50;i++){
            if(i%2 !=0){
                sum= sum+i;
            }
        }
        System.out.println(sum);
    }
}
