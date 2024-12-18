import java.util.Scanner;

public class stringConcat {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("first string:");
        String string1 = data.nextLine();
        
        System.out.println("second string:");
        String string2 = data.nextLine();

        String concat = "";

        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);
            boolean intersect = false;

            for (int j = 0; j < string2.length(); j++) {
                if (ch == string2.charAt(j)) {
                    intersect = true;
                }
            }

            if (!intersect) {
                concat += ch;
            }
        }

        for (int i = 0; i < string2.length(); i++) {
            char ch = string2.charAt(i);
            boolean intersect = false;

            for (int j = 0; j < string1.length(); j++) {
                if (ch == string1.charAt(j)) {
                    intersect = true;
                }
            }

            if (!intersect) {
                concat += ch;
            }
        }

        String convert = "";
        for (int idk = 0; idk < concat.length(); idk++) {
            char point = concat.charAt(idk);
            if (point >= 'a' && point <= 'z') {
                convert += (char) (((int) (point)) - 32);
            } else {
                convert += point;
            }
        }

        System.out.println("converted:");
        System.out.println(convert);

        data.close();
    }
}
