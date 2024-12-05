public class divisibilityCheck {
    public static void main(String[] args) {
        int num1 = 15, num2 = 28, num3 = 105, num4 = 36;

        for (int i = 1; i <= 4; i++) {
            int num;

            if (i == 1) {
                num = num1;
            } else if (i == 2) {
                num = num2;
            } else if (i == 3) {
                num = num3;
            } else {
                num = num4;
            }

            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println(num + " : Divisible by Both");
            } else if (num % 5 == 0 && num % 7 != 0) {
                System.out.println(num + " : Invalid: Divisible by 5 Only");
            } else if (num % 5 != 0 && num % 7 == 0) {
                System.out.println(num + " : Invalid: Divisible by 7 Only");
            } else {
                System.out.println(num + " : No");
            }
        }
    }
}
