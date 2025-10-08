import java.util.Objects;

/**
 * Lớp con circle kế thừa shape.
 */
public class Circle extends Shape {
    /**
     * Khai báo thuộc tính.
     */
    protected Point centerPoint;
    protected double radius;

    /**
     * Hàm tạo ko tham số.
     */
    public Circle() {
        super();
        this.centerPoint = new Point();
        this.radius = 1.0; //Khởi tạo giá trị mặc định.
    }

    /**
     * Hàm tạo 1 tham số.
     */
    public Circle(double radius) {
        super();
        this.centerPoint = new Point();
        this.radius = radius;
    }

    /**
     * Hàm tạo 3 tham số.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.centerPoint = new Point();
        this.radius = radius;
    }

    /**
     * Hàm tạo 4 tham số.
     */
    public Circle(Point centerPoint, double radius, String color, boolean filled) {
        super(color, filled);
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    /**
     * getter cho center.
     */
    public Point getCenterPoint() {
        return centerPoint;
    }

    /**
     * setter cho center.
     */
    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    /**
     * getter cho radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter cho radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Tính diện tích.
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius; //PI*r^2.
    }

    /**
     * Tính chu vi.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius; //2*PI*r.
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                this.centerPoint.toString(),
                this.radius,
                this.color != null && !this.color.isEmpty() ? this.color : "null",
                this.filled);
    }
}
