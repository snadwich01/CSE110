import java.util.Scanner;

public class caseConvert {
  public static void main (String [] args) {
    
    Scanner data = new Scanner(System.in);
    
    System.out.println("Please enter your message");
    String msg = data.nextLine();
    int vowelCount = 0;
    int consCount = 0;
    
    for (int idk = 0; idk < msg.length(); idk++) {
      char blk = msg.charAt (idk);
      
      if (blk >= 'A' && blk <= 'Z' || blk >= 'a' && blk <= 'z'){
        if (blk == 'a' || blk == 'e' || blk == 'i' || blk == 'o' || blk == 'u' || blk == 'A' || blk == 'E' || blk == 'I' || blk == 'O' || blk == 'U'){
          vowelCount++;
        } else{
           //consonant 
          consCount++;
        }
      }

      System.out.println(consCount);
    }
   
    data.close();
  }}
