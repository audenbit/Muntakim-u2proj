import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");

        System.out.print("Enter coordinate 1: ");
        String coordinate1 = sc.nextLine();
        int x1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf('(') + 1, coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(' ') + 1, coordinate1.indexOf(")")));

        System.out.print("Enter coordinate 2: ");
        String coordinate2 = sc.nextLine();
        int x2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf('(') + 1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(' ') + 1, coordinate2.indexOf(")")));

        if (x1 == x2) {
            System.out.println("Slope undefined. These points are on a vertical line: x = " + x1);
        } else {
            LinearEquation linEQ = new LinearEquation(x1, y1, x2, y2);
            System.out.println(linEQ.lineInfo());
            System.out.print("\nEnter a value for x: ");
            int newXVal = sc.nextInt();
            System.out.println("The point on the line is: " + linEQ.coordinateForX(newXVal));
        }
    }
}
