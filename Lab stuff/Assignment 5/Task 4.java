import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("String: ");
        String input = data.nextLine();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Reversed: " + reverse);

        data.close();
    }
}
