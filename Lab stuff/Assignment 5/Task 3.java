import java.util.Scanner;

public class charSplit {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("string to be split: ");
        String inputString = data.nextLine();

        System.out.print("Split Character: ");
        String inputChar = data.next();
        char split = inputChar.charAt(0);

        String temp = "";

        System.out.println("After split:");

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
             if (character == split) {
                System.out.println(temp);
                temp = "";
            } else {
                temp += character;
            }
        }

        if (temp.length() > 0) {
            System.out.println(temp);
        }

        data.close();
    }
}
