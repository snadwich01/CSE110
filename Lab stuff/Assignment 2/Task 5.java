public class numberCheck {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -2;
        int num3 = 0;

        int i = 1;
        while (i <= 3) {
            int num;

            if (i == 1) {
                num = num1;
            } else if (i == 2) {
                num = num2;
            } else {
                num = num3;
            }

            if (num < 0) {
                System.out.println(num + " : Number is negative");
            } else if (num == 0) {
                System.out.println(num + " : Number is zero");
            } else if (num % 2 == 0) {
                System.out.println(num + " : Number is positive and even");
            } else {
                System.out.println(num + " : Number is positive and odd");
            }

            i++;
        }
    }
}
