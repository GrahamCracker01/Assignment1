import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args) {

        //declare scanner and input variables
        Scanner scan = new Scanner(System.in);
        double laba;
        double assignmenta;
        double midterm;
        double finalexam;

        //declare output variables
        double labw;
        double assignmentw;
        double midtermw;
        double finalexamw;
        double grade;

        //Reading input
        System.out.println("[CSE 1321L Final Grade Calculator]");
        System.out.print("Enter your average lab grade: ");
        laba = scan.nextDouble();
        System.out.print("Enter your average assignment grade: ");
        assignmenta = scan.nextDouble();
        System.out.print("Enter your midterm exam grade: ");
        midterm = scan.nextDouble();
        System.out.print("Enter your final exam grade: ");
        finalexam = scan.nextDouble();

        //math
        labw = (laba * 0.1);
        assignmentw = (assignmenta * 0.4);
        midtermw = (midterm * 0.2);
        finalexamw = (finalexam * 0.3);
        grade = (labw + assignmentw + midtermw + finalexamw);

        //output
        System.out.println("");
        System.out.println("Your weighted lab average is " + labw);
        System.out.println("Your weighted assignment average is " + assignmentw);
        System.out.println("Your weighted midterm exam average is " + midtermw);
        System.out.println("Your weighted final exam average is " + finalexamw);
        System.out.println("Adding numbers...");
        System.out.println("Your final grade in CSE 1321L is " + grade);

    }
}
