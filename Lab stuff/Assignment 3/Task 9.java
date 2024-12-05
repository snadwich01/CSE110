public class num10sum {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        
        for (int m = 1; m <= num; m++) {
            sum += m;
            System.out.println("Current Number: " + m + ", Sum:" + sum);
        }
    }
}
