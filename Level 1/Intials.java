import java.util.Scanner;
public class Intials
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("First, middle and last Name Pl0x ");
        String name = sc.nextLine();
        
        int MiddleI = (name.indexOf(' ') + 1);
        int LastI = (name.lastIndexOf(' ') + 1);
        
        System.out.println(name.charAt(0) + "." + name.charAt(MiddleI) + "." + name.charAt(LastI));
    }
}
