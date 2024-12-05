public class numComp {
    public static void main(String[] args) {

        int num1 = 2345, num2 = 2452, num3 = 4532;
        int num4 = 230, num5 = 230, num6 = 112;

        for (int set = 1; set <= 2; set++) {
            int a, b, c;

            if (set == 1) {
                a = num1; b = num2; c = num3;
            } else {
                a = num4; b = num5; c = num6;
            }

            System.out.println(a + " " + b + " " + c);

            if (a == b && b == c) {
                System.out.println("All numbers are equal");
            } else if (a != b && b != c) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
