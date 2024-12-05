public class sqPrint1 {
    public static void main(String[] args) {
        int num = 18;
        while (num <= 63) {
            System.out.print(num);
            if (num < 63) {
                System.out.print(", ");
            }
            num += 9;
        }
    }
}
