import java.util.Scanner;

public class caseConvert {
  public static void main (String [] args) {
    
    Scanner data = new Scanner(System.in);
    
    System.out.println("Please enter the palindrome sample");
    String pali = data.nextLine();
    String output = "";
    
        for (int idk = 0; idk < pali.length(); idk++){
      char blk = pali.charAt(idk);
      if (blk >= 'A' && blk<= 'Z') {
        output += (char)(((int)(blk))+32);
      } else{
        output += blk;
      }
    }
    
    boolean palindromic;
    
    for (int pointer = 0; pointer <= output; pointer++){
      if (pointer % 2==0){
        
      } else{
        
      }
    }
    
    if(pointer == pali){
      System.out.println(palindromic);
    }
   
    data.close();
  }}
