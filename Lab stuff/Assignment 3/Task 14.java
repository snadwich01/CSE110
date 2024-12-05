public class primeCheck {
    public static void main(String[] args) {
        int num = 7;
        int divCount = 0;

        for (int n = 1; n <= num; n++) {
            if (num % n == 0) {
                divCount++;
            }
        }

        if (divCount == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
