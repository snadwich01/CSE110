import java.util.Scanner;

public class aLtCaP {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String in = data.nextLine();

        String converted = "";
        boolean convert = true;

        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (convert) {
                    converted += ch;
                } else {
                    converted += (char) (ch - 32);
                }
                convert = !convert;
            } else if (ch >= 'A' && ch <= 'Z') {
                if (convert) {
                    converted += (char) (ch + 32);
                } else {
                    converted += ch;
                }
                convert = !convert;
            } else {
                converted += ch;
            }
        }

        System.out.print("converted: ");
        System.out.println(converted);

        data.close();
    }
}
