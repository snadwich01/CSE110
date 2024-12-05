public class SequencePrinter {
    public static void main(String[] args) {
        int number = -10;

        System.out.println("Sequence using while loop:");
        while (number <= 20) {
            System.out.print(number);
            if (number != 20) {
                System.out.print(", ");
            }
            number += 5;
        }
    }
}
