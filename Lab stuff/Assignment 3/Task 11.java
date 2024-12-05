public class countDigits {
    public static void main(String[] args) {
        int num = 7456;
        int count = 0;
        
        while (num != 0) {
            num /= 10;
            count++;
        }
             
        System.out.println("Total digits = " + count);
    }
}
