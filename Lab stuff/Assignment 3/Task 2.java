public class sqPrint2 {
    public static void main(String[] args) {
        int num = 18;
        while (num <= 63) {
            if (num % 2 != 0) {
                System.out.print("-");
            }
            
            System.out.print(num);

            if (num < 63) {
                System.out.print(", ");
            }
            num += 9;
        }
    }
}
