import java.util.Scanner;
import java.util.Random;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Random danny = new Random();
        int n = danny.nextInt(21);
        int guess=0;
        boolean beans= false;
        System.out.println("Guess The Number");



        while (beans == false) {
            Scanner in = new Scanner(System.in);
            guess= in.nextInt();
            if (n < guess)
            {
                System.out.println("Too Large");
            }
            else if (n > guess) {
                System.out.println("Too Small");
            }
            else
            {
                System.out.println("You Are Correct");
                    beans = true;
            }
        }
    }
}
