public class calcyn {
    public static void main(String[] args) {
        int n = 20;
        int y = 0;

        for (int m = 1; m <= n; m++) {
            if (m % 2 != 0) {
                y += Math.pow(m, 2);
            } else if (m % 2 == 0) {
                y -= Math.pow(m, 2);
            }
        }
        System.out.println("y = " + y);
    }
}
