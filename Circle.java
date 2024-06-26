public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public String FillColor() {
        return fillColor;
    }

    public String BorderColor() {
        return borderColor;
    }
}
