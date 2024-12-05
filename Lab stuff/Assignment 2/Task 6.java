public class piecewiseFunc {
    public static void main(String[] args) {
        int num1 = -3;
        int num2 = 1;
        int num3 = 4;
        int num4 = 10;

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

            if (num < 0) {
                int act1 = (2 * num);
                System.out.println("output: " + act1);
            } else if (num >= 0 && num < 2) {
                int act2 = (num + 1);
                System.out.println("output: " + act2);
            } else if (num >= 2 && num < 5) {
                int act3 = ((num * num) - 1);
                System.out.println("output: " + act3);
            } else if (num >= 5) {
                int act4 = ((3 * num * num) + 2);
                System.out.println("output: " + act4);
            }
        }
    }
}
