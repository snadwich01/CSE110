import java.util.Scanner;

public class caseConvert {
  public static void main (String [] args) {
    
    Scanner data = new Scanner(System.in);
    
    System.out.println("Please enter the conversion characters");
    String theWord = data.nextLine();
    String output = "";
    
    //print uppercase
    
    for (int idk = 0; idk < theWord.length(); idk++){
      char blk = theWord.charAt(idk);
      if (blk >= 'A' && blk<= 'Z') {
        output += (char)(((int)(blk))+32);
      } else{
        output += blk;
      }
    }
     System.out.println(output);
   
    data.close();
  }}
