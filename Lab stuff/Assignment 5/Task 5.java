import java.util.Scanner;

public class treasuree {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Your message? : ");
        String msg = data.nextLine();

        int vowelCount = 0;
        int consCount = 0;

        for (int idk = 0; idk < msg.length(); idk++) {
            char letter = msg.charAt(idk);

            if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    vowelCount++;
                } else {
                    consCount++;
                }
            }
        }

        if (vowelCount > 0 && consCount > 0 && vowelCount % 3 == 0 && consCount % 5 == 0) {
            System.out.println("Aarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }

        data.close();
    }
}
