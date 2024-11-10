public class SmallestPalindromeNumberGreater {
    public static void main(String args[]){
        int num = 404;
        int temp = num+1;
        int rev=0;
        int original= temp ;


        while(true){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }
        if (rev == original){
            System.out.println();

        }
    }
}
