public class SimsimanActivity1Num9 {
    public static void main(String[] args) {
        
        double width = 5.6;
        double height = 8.5;

        double area1 = width * height;
        double perimeter1 = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area1));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter1));
    }
}
