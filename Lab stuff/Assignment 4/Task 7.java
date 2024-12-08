import java.util.Scanner;

public class yoddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");
        int X = scanner.nextInt();

        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();

        int sum = 0;
        int echo = 0;

        while (echo < Y) {
            if (X % 2 != 0) {
                sum += X;
                echo++;
            }
            X++;
        }
        System.out.println(sum);
        scanner.close();
    }
}
