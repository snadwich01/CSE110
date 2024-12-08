import java.util.Scanner;

public class maxminavg {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int totalin = data.nextInt();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int echo = 0, eSum = 0, avg = 0;

        for (int i = 1; i <= totalin; i -= -1) {
            System.out.print("Enter number " + i + ": ");
            int num = data.nextInt();

            if (num > max && num % 2 == 0) {
                max = num;
            } if (num < min && num > 0 && num % 2 == 0) {
                min = num;
            }

            if (num > 0 && num % 2 == 0) {
                eSum += num;
                echo++;
            }
        }

        if(echo == 0){
            avg = 0; 
        } else{
            avg = eSum / echo;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);

        data.close();
    }
}
