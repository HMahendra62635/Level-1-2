import java.util.Scanner;
public class ToUppercase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what postcode be? ");
        String Postcode = sc.nextLine();
        System.out.println("Your postcode in uppercase = " + Postcode.toUpperCase());
    }
}
