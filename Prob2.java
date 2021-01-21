import java.util.Scanner;

class Prob2 {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in); 
   System.out.print("Enter a String: ");
   String word = scan.nextLine();
   System.out.print(word.substring(0,1));
   System.out.print(word.substring(word.length()-1));

  }
}