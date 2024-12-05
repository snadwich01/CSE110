public class reverseDigits {
    public static void main(String[] args) {
        int num = 32768;

        while (num != 0) {
            int digit = num % 10;

            System.out.print(digit);

            num /= 10;

            if (num != 0) {
                System.out.print(", ");
            }
        }
    }
}
