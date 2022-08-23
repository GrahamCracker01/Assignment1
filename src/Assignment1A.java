import java.util.Scanner;
//imports scanner class item
public class Assignment1A {
    public static void main(String[] args) {

        //declares input and output in doubles
        double widthp;
        double heightp;
        double resolution;
        double widthi;
        double heighti;

        //first output
        Scanner scan = new Scanner(System.in);
        System.out.println("[Print Resolution]");
        System.out.println("");

        //first scan and save
        System.out.print("Enter the width (in pixels): ");
        widthp = scan.nextDouble();

        //second scan and save
        System.out.print("Enter the height (in pixels): ");
        heightp = scan.nextDouble();

        //last scan and save
        System.out.print("Enter the resolution (PPI): ");
        resolution = scan.nextDouble();

        //math and output
        widthi = (widthp / resolution);
        heighti = (heightp / resolution);
        System.out.println("At " + resolution + " PPI, the image is " + widthi + "'' wide by " + heighti + "'' high.");

    }
}
