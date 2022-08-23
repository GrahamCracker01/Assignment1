import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args) {

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        char letter;
        int b;
        int c;
        int d;

        //read input
        System.out.println("[And the next letter is]");
        System.out.print("Please enter a letter: ");
        letter = scan.next().charAt(0);

        //cast letter to int and do math
        int a = (letter);
        b = (a + 1);
        c = (a + 2);
        d = (a + 3);

        //cast ints back into chars
        char lettera = (char) b;
        char letterb = (char) c;
        char letterc = (char) d;

        //output
        System.out.print("The next letters after " + letter + " are " + lettera + ", " + letterb + ", and " + letterc + "!");
    }
}
