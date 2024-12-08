import java.util.Scanner;

public class yseries {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = data.nextInt();

        if (N > 0) {
            int total = 0;

            for (int i = 1; i <= N; i++) {
                int series = 0;

                for (int j = 1; j <= i; j++) {
                    series += j;
                }
                total -= series;
            }
            System.out.println("The value of total: " + total);
        }

        data.close();
    }
}
