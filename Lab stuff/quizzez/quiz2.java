public class test {
  public static void main (String [] args){
  int point1 =64;
  int dec1 = 6;
  int stepCount1 = 0;
  int point2 = 50;
  int dec2 = 4;
  int stepCount2 = 0;
  
  while (point1 > 22){
  point1 = point1-6;
  stepCount1++;
  }
  
    while (point2 > 22){
  point2 = point2-4;
  stepCount2++;
  }
    
    if (point1 == point2){
    System.out.println(point1 + " and " + point2);
    System.out.println(++stepCount1);
    }
  }}
