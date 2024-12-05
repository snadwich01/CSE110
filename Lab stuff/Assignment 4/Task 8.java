import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Please enter the lentgh of the rectangle");
        int lentgh = data.nextInt();
        System.out.println();
        System.out.print("Please enter the width of the rectangle");
        int width = data.nextInt();
        System.out.println();
        
        for (int j = 1; j<=width; j++) {
         for (int i = 1; i <= lentgh; i++){
         System.out.print(i);
         }
         System.out.println();
        }
        
        System.out.println();   
        data.close();
    }
}
