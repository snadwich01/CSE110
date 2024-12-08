import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = data.nextInt();

        int echo = 0;
        int prime = 2; 

        while (echo < num) {
            int div = 0;

            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    div++;
                }
            } if (div == 2) {
                System.out.println(prime);
                echo++;
            }
            prime++;
        }
        data.close();
    }
}
