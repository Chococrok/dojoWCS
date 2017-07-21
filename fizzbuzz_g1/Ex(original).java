public class Ex {
  public static String fizzbuzz(int n) {
   if (n % 15 == 0) {
     return ("fizzbuzz");
   }
   if (n % 3 == 0 ) {
     return ("fizz");
   }
   if (n % 5 == 0) {
     return "buzz"; 
   }
   return String.valueOf(n); 
  }
}
