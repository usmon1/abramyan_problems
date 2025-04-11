import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double R = scanner.nextDouble();
        
        
        double L = 2 * 3.14 * R;
        double S = 3.14 * R * R;
        
        System.out.println("Длина окружности L = " + L);
        System.out.println("Площадь круга S = " + S);
        
        scanner.close();
    }
}
