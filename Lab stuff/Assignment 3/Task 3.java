public class addMult1 {
    public static void main(String[] args) {
    int sum = 0;
    int limit = 600;

    for(int num = 1; num <= limit; num++) {
        if (num % 7 == 0 && num % 9 == 0) {
            sum += num;
        }
    }

    System.out.println("The sum of all numbers that are multiples of both 7 and 9 up to 600:");
    System.out.println(sum);

    }
}