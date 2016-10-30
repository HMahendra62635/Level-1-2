import java.util.Scanner;
public class CheckMatch
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Password pl0x ");
        String Password1 = sc.nextLine();
        System.out.println("Verify Password pl0x ");
        String Password2 = sc.nextLine();
        System.out.println("Passwords match: " + Password1.equals(Password2));
    }
}
