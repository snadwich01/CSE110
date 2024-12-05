public class triangleType {
    public static void main(String[] args) {
        //Scalene
        int sca1 = 5, sca2 = 2, sca3 = 4;

        System.out.println("For sides " + sca1 + ", "  + sca2 + ", and " + sca3);

        if (sca1 == sca2 && sca2 == sca3) {
            System.out.println("This is an Equilateral triangle");
        } else if (sca1 == sca2 || sca2 == sca3 || sca1 == sca3) {
            System.out.println("This is an Isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }

        //Iso
        int iso1 = 5, iso2 = 5, iso3 = 3;

        System.out.println("For sides " + iso1 + ", " + iso2 + ", and " + iso3);

        if (iso1 == iso2 && iso2 == iso3) {
            System.out.println("This is an Equilateral triangle");
        } else if (iso1 == iso2 || iso2 == iso3 || iso1 == iso3) {
            System.out.println("This is an Isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }

        //Equi
        int equi1 = 3, equi2 = 3, equi3 = 3;

        System.out.println("For sides " + equi1 + ", "  + equi2 + ", and " + equi3);

        if (equi1 == equi2 && equi2 == equi3) {
            System.out.println("This is an Equilateral triangle");
        } else if (equi1 == equi2 || equi2 == equi3 || equi1 == equi3) {
            System.out.println("This is an Isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }
    }
}
