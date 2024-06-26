class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double Perimeter() {
        return 2 * (length + width);
    }

    public double Area() {
        return length * width;
    }

    public String FillColor() {
        return fillColor;
    }

    public String BorderColor() {
        return borderColor;
    }
}
