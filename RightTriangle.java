import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        
        double b = scanner.nextDouble();
        
        double c = Math.sqrt(a * a + b * b);
        
        double P = a + b + c;
        
        System.out.println("Гипотенуза треугольника: " + c);
        System.out.println("Периметр треугольника: " + P);
        
        scanner.close();
    }
}
