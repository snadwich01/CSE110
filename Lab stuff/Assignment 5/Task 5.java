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
      
      if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){        
        } else{
           //consonant 
          consCount++;
        }
      }
    }
   
    data.close();
  }}
