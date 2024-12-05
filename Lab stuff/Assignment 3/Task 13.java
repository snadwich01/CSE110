public class digitPrint {
    public static void main(String[] args) {

        int number = 32768, temp = number, digits = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }   

        int div = 1;

        for (int i = 1; i < digits; i++) {
            div *= 10;
        }

        while (div > 0) {
            int digit = number / div;
            System.out.print(digit);
            
            if (div > 1) {
                System.out.print(", ");
            }
            
            number %= div;
            div /= 10;
        } 
        
        System.out.println();
    }
}
