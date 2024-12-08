import java.util.Scanner;

public class yseries {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter number: ");
        int N = data.nextInt();
        int divCount = 0;

        if (N % 2 == 0) {
            int factor = 0;
            
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    divCount++;
                }
            }
        }
        System.out.println(N + " has " + divCount + " divisors");

        data.close();
    }
}
