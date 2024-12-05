public class perfNum {
    public static void main(String[] args) {
        int num = 6;
        int sumdiv = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumdiv += i;
            }
        }

        if (sumdiv == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
