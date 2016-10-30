import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("word for reverse ");
        String word = sc.nextLine();
        
        for (int v = 0; v < word.length(); v++) {
            System.out.println(word.charAt(word.length() - v - 1));
        }
    }
}
