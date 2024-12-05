public class oddsum {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;

        System.out.println("The odd numbers are:");
        
        for (int m = 1; m <= num; m++) {
            int odd = 2 * m -1;
            System.out.println(odd);
            sum += odd;
        }

        System.out.println("The sum of odd natural numbers up to " + num + " terms is: " + sum);
    }
}
