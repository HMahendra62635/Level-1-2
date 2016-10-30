import java.util.Scanner;
public class RANDOM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------");
        
        String known = "??????";
        char[] knownchar = known.toCharArray();
        
        String answer = "RANDOM";
        char[] answerchar = answer.toCharArray();
        
        do { 
            System.out.println("Guess, hint word is 6 characters long.");
            String guess = sc.nextLine().toUpperCase();
            System.out.println("your guess = " + guess);
            if (guess.length() < 6) {
                for (int v = 0; v < guess.length() ; v++) {
                    if (guess.charAt(v) == (answer.charAt(v)))  {
                        knownchar[v] = answerchar[v];
                    }
                }
            } else {
                for (int v = 0; v < 6; v++) {
                    if (guess.charAt(v) == (answer.charAt(v)))  {
                        knownchar[v] = answerchar[v];
                    }
                }
            }
            known = new String(knownchar);
            answer = new String(answerchar);
            System.out.println("current known values = " + known);
        } while (!known.equals(answer));
        System.out.println("GRATZ! Your guess is correct!");
    }
}