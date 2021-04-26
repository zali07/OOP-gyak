package labor2_2;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
//        if (width>0 && length>0) {
//            this.length = length;
//            this.width = width;
//        }
        if (width <= 0 || length <= 0) {
            return;
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return width*length;
    }

    public double perimeter() {
        return 2*(width+length);
    }
}
