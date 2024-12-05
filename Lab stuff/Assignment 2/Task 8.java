public class taxCalc {
    public static void main(String[] args) {

        int payment1 = 9000, age1 = 23;
        int payment2 = 15000, age2 = 17;
        int payment3 = 15000, age3 = 18;
        int payment4 = 30000, age4 = 25;

        for (int n = 1; n <= 4; n++) {
            int payment = 0, age = 0;

            if (n == 1) {
                payment = payment1;
                age = age1;
            } else if (n == 2) {
                payment = payment2;
                age = age2;
            } else if (n == 3) {
                payment = payment3;
                age = age3;
            } else if (n == 4) {
                payment = payment4;
                age = age4;
            }

            System.out.print("For salary = " + payment + ", age = " + age + " : ");
            if (age < 18) {
                System.out.println("Your tax amounts to 0 Tk");
            } else if (payment < 10000) {
                System.out.println("Your tax amounts to 0 Tk");
            } else if (payment <= 20000) {
                System.out.println("Your tax amounts to " + (payment * 5 / 100) + " Tk");
            } else {
                System.out.println("Your tax amounts to " + (payment * 10 / 100) + " Tk");
            }
        }
    }
}
