import java.util.Scanner;
public class Length
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what name be? ");
        String Name = sc.nextLine();
        System.out.println("length of name = " + Name.length());
    }
}
