import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = data.nextLine();

        String temp = "";
        String result = "";
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char current = input.charAt(i);
            if (current == ' ') {
                for (int j = temp.length() - 1; j >= 0; j--) {
                    reverse += temp.charAt(j);
                }
                result += reverse + " ";
                temp = "";
                reverse = "";
            } else {
                temp += current;
            }
        }

        for (int j = temp.length() - 1; j >= 0; j--) {
            reverse += temp.charAt(j);
        }
        result += reverse;

        System.out.print("Reverse: ");
        System.out.println(result);

        data.close();
    }
}
