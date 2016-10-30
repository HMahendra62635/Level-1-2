public class substring
{
    public static void main(String[] args)
    {
        String mystring = "samsung exploding galaxies";
        System.out.print(mystring.substring(5,10));
        System.out.println();
        
        for (int i = 9; i < mystring.length(); i++) {
            System.out.print(mystring.substring(i, i+1));
        }
    }
}
