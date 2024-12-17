import java.util.Scanner;

public class palindromic {
    public static void main(String[] args) {
        Scanner echo = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String theWord = echo.nextLine();
        String converted = "";

        for (int idk = 0; idk < theWord.length(); idk++) {
            char point = theWord.charAt(idk);
            if (point >= 'A' && point <= 'Z') {
                converted += (char) (point + 32);
            } else {
                converted += point;
            }}

        String reverse = "";
        for (int idk = theWord.length() - 1; idk >= 0; idk--) {
            char rev = theWord.charAt(idk);
            if (rev >= 'A' && rev <= 'Z') {
                reverse += (char) (rev + 32);
            } else {
                reverse += rev;
            }}

        boolean pali = true;
        for (int idk = 0; idk < converted.length(); idk++) {
            if (converted.charAt(idk) != reverse.charAt(idk)) {
                pali = false;
            }}

        if (pali) {
            System.out.println(pali);
        } else {
            System.out.println(pali);
        }

        echo.close();
    }
}
