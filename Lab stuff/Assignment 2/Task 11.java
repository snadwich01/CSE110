public class BastobStore {
    public static void main(String[] args) {

        int cost1 = 35, paid1 = 53;
        int cost2 = 60, paid2 = 500;
        int cost3 = 50, paid3 = 50;
        int cost4 = 550, paid4 = 520;

        for (int i = 1; i <= 4; i++) {
            int cost = 0, paid = 0;

            if (i == 1) {
                cost = cost1;
                paid = paid1;
            } else if (i == 2) {
                cost = cost2;
                paid = paid2;
            } else if (i == 3) {
                cost = cost3;
                paid = paid3;
            } else if (i == 4) {
                cost = cost4;
                paid = paid4;
            }

            System.out.println();
            System.out.println("The amount the customer need to pay (Taka):");
            System.out.println(cost);
            System.out.println("Customer gave (Taka):");
            System.out.println(paid);

            if (paid > cost) {
                int change = paid - cost;
                System.out.println();
                System.out.println("The returned amount is " + change + " taka.");

                System.out.println("100 taka note: " + (change / 100));
                change %= 100;

                System.out.println("50 taka note: " + (change / 50));
                change %= 50;

                System.out.println("20 taka note: " + (change / 20));
                change %= 20;

                System.out.println("10 taka note: " + (change / 10));
                change %= 10;

                System.out.println("5 taka coin: " + (change / 5));
                change %= 5;

                System.out.println("2 taka coin: " + (change / 2));
                change %= 2;

                System.out.println("1 taka coin: " + change);

            } else if (paid < cost) {
                int shortage = cost - paid;
                System.out.println();
                System.out.println("Please pay " + shortage + " taka more.");
            } else {
                System.out.println();
                System.out.println("The returned amount is 0 taka.");
            }
        }
    }
}


//Task 12

public class numComp {
    public static void main(String[] args) {

        int num1 = 2345, num2 = 2452, num3 = 4532;
        int num4 = 230, num5 = 230, num6 = 112;

        for (int set = 1; set <= 2; set++) {
            int a, b, c;

            if (set == 1) {
                a = num1; b = num2; c = num3;
            } else {
                a = num4; b = num5; c = num6;
            }

            System.out.println(a + " " + b + " " + c);

            if (a == b && b == c) {
                System.out.println("All numbers are equal");
            } else if (a != b && b != c) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
