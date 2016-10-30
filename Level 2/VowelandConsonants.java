import java.util.Scanner;
public class VowelandConsonants
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = "";
        do {
            System.out.println("input a word please");
            word = sc.nextLine();  
        } while ( word.equals(""));
        int vowelcount = 0;
        int consonantcount =0;
        char a = 'a';
        char e = 'e';
        char i = 'i'; 
        char o = 'o';
        char u = 'u';
        char A = 'A';
        char E = 'E';
        char I = 'I';
        char O = 'O';
        char U = 'U';
        for (int v = 0; v < word.length(); v++) {
            if (word.charAt(v) == a || word.charAt(v) == e || word.charAt(v) == i || word.charAt(v) == o ||word.charAt(v)== u) { 
                vowelcount = vowelcount + 1;
            } 
            else {
                consonantcount = consonantcount +1; 
            }
        }
        System.out.println("Vowel No. = " + vowelcount);
        System.out.println("Consonant & Space No. = " + consonantcount);
    }
}
