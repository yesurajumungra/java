public class ProductOfDigits {
    public static void main(String[] args){
        int num = -17;
        int lastDigit;
        int product =1;
        while(num!=  0){
            lastDigit = num%10;
            product = product *lastDigit;
            num = num/10;

        }
        System.out.println(product);
    }
}
