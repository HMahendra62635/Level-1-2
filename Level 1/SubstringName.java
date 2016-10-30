import java.util.Scanner;
public class SubstringName
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Full name pl0x ");
       
       String Fullname = sc.nextLine();
       
       System.out.println("Hello " + Fullname.substring(Fullname.indexOf(' ')+1, Fullname.length()));
       
       for (int Seperation = Fullname.indexOf(' '); Seperation < Fullname.length(); Seperation++) {
           System.out.println(Fullname.substring(Seperation, Seperation+1));
        } // this part is bad
    }
}
