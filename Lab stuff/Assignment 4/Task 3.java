import java.util.Scanner;

public class lab4task3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = data.nextInt();
        int num1 = 1;
       
        int countNega = 0;
        int countPosi = 0;

        while (num1 <= num) {
            System.out.print("Enter number " + num1++ + ":");
            int input = data.nextInt();
            
            if (input < 0) {
            countNega++;
            } else {
            countPosi++;
            } 
            }
        
        System.out.println(countPosi  + " Non-negative Numbers");
        System.out.println(countNega  + " Negative Numbers");
        
        data.close();
    }
}
