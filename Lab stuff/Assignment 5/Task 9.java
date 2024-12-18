import java.util.Scanner;

public class passCheck {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass= data.nextLine();

        boolean upper = false ;
        boolean lower = false ;
        boolean digit = false ;
        boolean special = false ;

        if (pass.length() >= 8) {
            for (int i = 0; i < pass.length(); i++) {
                if ((int) pass.charAt(i) >= 65 && (int) pass.charAt(i) <= 90) {
                    upper = true; //Uppercase ASCII
                } if ((int) pass.charAt(i) >= 97 && (int) pass.charAt(i) <= 122) {
                    lower = true; //Lowercase ASCII
                } if ((int) pass.charAt(i) >= 48 && (int) pass.charAt(i) <= 57) {
                    digit = true; //Number ASCII
                } if ((int) pass.charAt(i) == 33 || (int) pass.charAt(i) == 35 || (int) pass.charAt(i) == 36 || (int) pass.charAt(i) == 64) {
                    special = true; //Special character ASCII
                }
            }
        }
            if (upper && lower && digit && special) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
