import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Start: ");
        int start = data.nextInt();

        System.out.print("End: ");
        int end = data.nextInt();

        System.out.println("Armstrong numbers: ");
        
        for (int i = start; i <= end; i++) {
            int j = i, expo = 0;
            while (j != 0) {
                int dig = j % 10;
                expo += dig * dig * dig;
                j /= 10;
            }
            if (expo == i) {
                System.out.println(i);
            }
        }
        data.close();
    }
}
