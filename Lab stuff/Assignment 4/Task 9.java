import java.util.Scanner;

public class rightjustTri {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        System.out.print("Please enter the height: ");
        int height = data.nextInt();

        for(int k = 1; k <= height; k++){
            for(int gap = height; gap > k; gap--){
                System.out.print(" ");
            } for(int num = 1; num <= k; num++){
                System.out.print(num);
            }
            System.out.println();
        }
        data.close();
    }
}
