public class sessionID {
    public static void main(String[] args) {

        int id1 = 16101307;
        int id2 = 19301307;
        int id3 = 20201307;

        for (int i = 1; i <= 3; i++) {
            int id;
            if (i == 1) {
                id = id1;
            } else if (i == 2) {
                id = id2;
            } else {
                id = id3;
            }

            int yr = id / 1000000;
            int sesID = (id / 100000) % 10;

            if (sesID == 1) {
                System.out.println("Student joined BRAC in Spring " + yr);
            } else if (sesID == 3) {
                System.out.println("Student joined BRAC in Summer " + yr);
            } else if (sesID == 2) {
                System.out.println("Student joined BRAC in Fall " + yr);
            }
        }
    }
}
