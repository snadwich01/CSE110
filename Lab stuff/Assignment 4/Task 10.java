import java.util.Scanner;

public class isoTri {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Please enter the height of the triangle: ");
        int rows = data.nextInt();
        
        for(int i = 1; i <= rows; i++){
                for(int gap = rows; gap > i; gap--){
                    System.out.print(" ");
                }
                for(int num = 1; num <= i; num++){
                    System.out.print(num + " ");
                }
            System.out.println();
        }
        data.close();
    }
}
