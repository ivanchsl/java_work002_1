import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector vector1 = new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
        Vector vector2 = new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println(vector1.equals(vector2));
        System.out.println("1st length: " + vector1.length());
        System.out.println("2nd length: " + vector2.length());
        System.out.println("Scalar product: " + vector1.scalarProduct(vector2));
        System.out.println("Cross product: " + vector1.crossProduct(vector2));
        System.out.println("Cos: " + vector1.cos(vector2));
        System.out.println("Add: " + vector1.add(vector2));
        System.out.println("Subtract: " + vector1.subtract(vector2));
    }
}
