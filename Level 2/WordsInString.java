import java.util.Scanner;
public class WordsInString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Phrase. ");
        String Phrase = sc.nextLine();
        int spacecount = 0;
        
        for (int v =0;  v < Phrase.length(); v++) {
            char space = ' ';
            if (Phrase.charAt(v) == space){
                spacecount = spacecount + 1;
            }
        }
        System.out.println(spacecount + 1);
    }
}