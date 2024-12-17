import java.util.Scanner;

public class caseConversion {
  public static void main (String [] args) {
    
    Scanner data = new Scanner(System.in);
    
    System.out.print("Please enter the conversion characters: ");
    String theWord = data.nextLine();
    String converted = "";
    
    for (int idk = 0; idk < theWord.length(); idk++){
      char point = theWord.charAt(idk);
      if (point >= 'a' && point<= 'z') {
        converted += (char)(((int)(point)) - 32);
      } else{
        converted += point;
      }
    }
     System.out.println("Converted: " + converted);

    data.close();
  }
}
