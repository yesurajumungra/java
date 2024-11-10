public class DivisbleBy3And5From1To1000 {
    public static void main(String[] args) {
        int count=0;

        for(int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0){
                     System.out.println(i);
                     count++;
            }
        }
        System.out.println("total"+count);
        
    } 
}
