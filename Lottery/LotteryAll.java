import java.util.Scanner;
public class LotteryAll
{
    public static void procedure() {
        
    }
    
    public static int function(int x) {
        return x;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("lotto balls range from 1 - 49. Dummies who guess otherwise may re-guess");
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        
        do { 
            System.out.println("First guess:");
            num1 = sc.nextInt(); 
        } while (num1 >= 50 || num1 <= 0);
        System.out.println("Guess1 = " + num1);
        
        do {
            System.out.println("Second Guess:");
            num2 = sc.nextInt();
        } while (num2 >= 50 || num2 <= 0 || num2 == num1);
        System.out.println("Guess2 = " + num2);
        
        do {
            System.out.println("Third Guess");
            num3 = sc.nextInt();
        } while (num3 >= 50 || num3 <= 0 || num3 == num2 || num3 == num1); 
        System.out.println("Guess3 = " + num3);
        
        do {
            System.out.println("Fourth Guess");
            num4 = sc.nextInt();
        } while (num4 >= 50 || num4 <= 0 || num4 == num3 || num4 == num2 || num4 == num1); 
        System.out.println("Guess4 = " + num4);
        
        do {
            System.out.println("Fifth Guess");
            num5 = sc.nextInt();
        } while (num5 >= 50 || num5 <= 0 || num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1); 
        System.out.println("Guess5 = " + num5);
        
        do {
            System.out.println("Sixth Guess");
            num6 = sc.nextInt();
        } while (num6 >= 50 || num6 <= 0 || num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1); 
        System.out.println("Guess6 = " + num6);
        
        System.out.println("Your guesses = " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);

        
        double ball2 = 0;
        double ball3 = 0;
        double ball4 = 0;
        double ball5 = 0;
        double ball6 = 0;
        double BBB = 0;
        
        double ball1 =  Math.ceil(Math.random()*49);
        
        do {
            ball2 =  Math.ceil(Math.random()*49);
        } while (ball2 == ball1);
        
        do {
            ball3 =  Math.ceil(Math.random()*49);
        } while (ball3 == ball2 || ball3 == ball1);
        
        do {
            ball4 =  Math.ceil(Math.random()*49);
        } while (ball4 == ball3 || ball4 == ball2 || ball4 == ball1);

        do {
            ball5 =  Math.ceil(Math.random()*49);
        } while (ball5 == ball4 || ball5 == ball3 || ball5 == ball2 || ball5 == ball1);
        
        do {
            ball6 =  Math.ceil(Math.random()*49);
        } while (ball6 == ball5 || ball6 == ball4 || ball6 == ball3 || ball6 == ball2 || ball6 == ball1);
        
        do {
            BBB =  Math.ceil(Math.random()*49);
        } while (BBB == ball6 || BBB == ball5 || BBB == ball4 || BBB == ball3 || BBB == ball2 || BBB == ball1);
        System.out.println("The balls = " + ball1 + ", " + ball2 + ", " + ball3 + ", " + ball4 + ", " + ball5 + ", " + ball6 + ", " + BBB);

        
        int matchcount = 0;

        if (num1 == ball1 || num1 == ball2 || num1 == ball3 || num1 == ball4 || num1 == ball5 || num1 == ball6) {
            matchcount = matchcount + 1;
        }
        
        if (num2 == ball1 || num2 == ball2 || num2 == ball3 || num2 == ball4 || num2 == ball5 || num2 == ball6) {
            matchcount = matchcount + 1;
        }
        
        if (num3 == ball1 || num3 == ball2 || num3 == ball3 || num3 == ball4 || num3 == ball5 || num3 == ball6) {
            matchcount = matchcount + 1;
        }
        
        if (num4 == ball1 || num4 == ball2 || num4 == ball3 || num4 == ball4 || num4 == ball5 || num4 == ball6) {
            matchcount = matchcount + 1;
        }
        
        if (num5 == ball1 || num5 == ball2 || num5 == ball3 || num5 == ball4 || num5 == ball5 || num5 == ball6) {
            matchcount = matchcount + 1;
        }
        
        if (num6 == ball1 || num6 == ball2 || num6 == ball3 || num6 == ball4 || num6 == ball5 || num6 == ball6) {
            matchcount = matchcount + 1;
        }
        
        if (matchcount == 3){
            System.out.println("3 matched! You won £10!");
        } else if (matchcount == 4) {
            System.out.println("4 matched! You won £100!!");
        } else if (matchcount == 5) {
            if (BBB == num6 || BBB == num5 || BBB == num4 || BBB == num3 || BBB == num2 || BBB == num1) {
                System.out.println("5 matched + the bonus ball! You won £100,000!!!!");
            } else {
                System.out.println("5 matched! You won £10,000!!!");
            }
        } else if(matchcount == 6) {
            System.out.println("6 matched! You won £1,000,000!!!!!");
        } else {
            System.out.println("unlucky, not enough matches.");
        }
    }   
}

