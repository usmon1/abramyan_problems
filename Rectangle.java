import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        
        double b = scanner.nextDouble();
        
        double S = a * b;
        double P = 2 * (a + b);
        
        System.out.println("Площадь прямоугольника S = " + S);
        System.out.println("Периметр прямоугольника P = " + P);
        
        scanner.close();
    }
}
