public class leapYearCheck {
    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 2001;
        int year3 = 1900;

        for (int i = 1; i <= 3; i++) {
            int year;

            if (i == 1) {
                year = year1;
            } else if (i == 2) {
                year = year2;
            } else {
                year = year3;
            }

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
