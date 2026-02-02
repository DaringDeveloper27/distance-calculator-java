// The Distance Calculator in Java
package Chapter4;
import java.util.Scanner;
public class distanceCalculator {
    public static void main(String[] args){
        // Asking user the values of the points
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1_user = scanner.nextInt();
        System.out.println("Enter x2: ");
        int x2_user = scanner.nextInt();
        System.out.println("Enter y1: ");
        int y1_user = scanner.nextInt();
        System.out.println("Enter y2: ");
        int y2_user = scanner.nextInt();
        // Printing some text with the function
        System.out.println("The distance is: " + distance(x1_user, x2_user, y1_user, y2_user));
    }
    // Double function - the distance calculator
    public static double distance(int x1, int x2, int y1, int y2){
        // the logic using the distance formula
        double totalDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return totalDistance;
    }
}
