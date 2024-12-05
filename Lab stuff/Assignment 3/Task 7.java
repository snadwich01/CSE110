public class divs {
    public static void main(String[] args) {
        int num = 6;
        int divnum = 0;

        System.out.println("Divisors of " + num + ":");
        
        for (int div = 1; div <= num; div++) {
            if (num % div == 0) {
                System.out.println(div);
                divnum++;
            }
        }

        System.out.println("Total Divisors: " + divnum);
    }
}
