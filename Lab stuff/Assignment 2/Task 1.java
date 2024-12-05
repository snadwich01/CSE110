public class largestNumber {
    public static void main(String[] args){
        int num1=100, num2=23, num3=-4;

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number: "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number: "+ num2);
        } else {
            System.out.println("Largest number: "+ num3);
        }

        int num4=5, num5=17, num6=-5;

        if (num4 > num5 && num4 > num6) {
            System.out.println("Largest number: "+ num4);
        } else if (num5 > num4 && num5 > num6) {
            System.out.println("Largest number: "+ num5);
        } else {
            System.out.println("Largest number: "+ num6);
        }

    }
}
