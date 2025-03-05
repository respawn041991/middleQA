import java.util.*;

public class Main {
    
    public static String accum(String s) {
      
      String[] arr = s.split("");
      String res = "";
            
      for(int i = 0; i < arr.length; i++) {
        
        res += arr[i].toUpperCase();
        
        for(int j = 0; j < i; j++) {
          
          res += arr[i].toLowerCase();
        }
        
        res += "-"; 
      }
      
      return res;
  }
    
    public static void main(String[] args) {
      String s = "abcd";
      
      System.out.println(accum(s));
  }
}
