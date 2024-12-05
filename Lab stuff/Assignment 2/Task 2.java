public class score {
    public static void main(String[] args) {
        int score1 = 9, score2 = 82;

        for (int i = 1; i <= 2; i++) {
            int score;
            if (i == 1) {
                score = score1;
            } else {
                score = score2;
            }

            System.out.println("Given Score: " + score);
            if (score <= 100 && score >= 90) {
                System.out.println("Your grade is A");
            } else if (score <= 89 && score >= 85) {
                System.out.println("Your grade is A-");
            } else if (score <= 84 && score >= 70) {
                System.out.println("Your grade is B");
            } else if (score <= 69 && score >= 57) {
                System.out.println("Your grade is C");
            } else if (score <= 56 && score >= 50) {
                System.out.println("Your grade is D");
            } else {
                System.out.println("Your grade is F");
            }
        }
    }
}
