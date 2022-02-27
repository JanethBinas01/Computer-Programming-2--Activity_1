package RemovingWhiteSpaceFromAString;

public class REMOVINGWHITESPACEFROMASTRING {

  public static void main(String[] args) 
  
  {
  
     String str = " K E E P S A F E ";
     
     
     str = str. replaceAll("\\s", "");
     
     
     
         System.out.println(str);
         
         
  }
}