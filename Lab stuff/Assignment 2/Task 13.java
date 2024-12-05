public class sequencePrint {
    public static void main(String[] args) {
        int number = 24;

        System.out.println("Sequence using while loop:");
        while (number >= -6) {
            System.out.print(number);
            if (number != -6) {
                System.out.print(", ");
            }
            number -= 6;
        }
    }
}
