
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double area = rectangle.calculateArea();
        System.out.println("Calculated Area: " + area);

        AreaFileSaver areaFileSaver = new AreaFileSaver();
        areaFileSaver.saveAreaToFile(area);
    }
}
