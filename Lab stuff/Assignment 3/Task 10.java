public class num10sum {
    public static void main(String[] args) {
        int num = 40;
        
        for (int m = 1; m <= num; m++) {
            if (m % 5 == 0 && m % 3 != 0 ){
                System.out.println(m);
            }
        }
    }
}
