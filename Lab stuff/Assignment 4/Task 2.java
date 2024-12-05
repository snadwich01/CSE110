import java.util.Scanner;

public class maxminavg {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = data.nextInt();

        while (num >= 0) {
            int num1 = num * num;
            System.out.println(num + " ^ 2 = " + num1);
            System.out.print("Enter number: ");

            num = data.nextInt();
        }

        data.close();
    }
}
