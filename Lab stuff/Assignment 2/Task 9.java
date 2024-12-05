public class maxMinCalc {
    public static void main(String[] args) {

        double numA = 18.83, numB = -4.02, numC = 83.12;
        double numD = 26.45, numE = 0.02, numF = 13.56;

        for (int n = 1; n <= 2; n++) {
            double num1 = 0, num2 = 0, num3 = 0;

            if (n == 1) {
                num1 = numA;
                num2 = numB;
                num3 = numC;
            } else if (n == 2) {
                num1 = numD;
                num2 = numE;
                num3 = numF;
            }

            double max = num1;
            if (num2 > max) {
                max = num2;
            } else if (num3 > max) {
                max = num3;
            }

            double min = num1;
            if (num2 < min) {
                min = num2;
            } else if (num3 < min) {
                min = num3;
            }

            System.out.println("For the numbers " + num1 + ", " + num2 + ", " + num3 + " :");
            System.out.println("Maximum number is " + max);
            System.out.println("Minimum number is " + min);
        }
    }
}
