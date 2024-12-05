public class sumAvg {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 1;

        while (i <= 200) {
            sum += i;
            count++;
            i++;
        }

        double avg = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
