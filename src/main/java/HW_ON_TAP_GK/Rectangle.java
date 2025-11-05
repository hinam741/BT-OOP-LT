package HW_ON_TAP_GK;

/**
 * Lớp con rectangle kế thừa shape.
 */
public class Rectangle extends Shape {
    /**
     * Khai báo thuộc tính.
     */
    protected double width;
    protected double length;
    private Point centerPoint;

    /**
     * Hàm tạo 5 tham số.
     */
    public Rectangle(Point centerPoint, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.centerPoint = centerPoint;
        this.width = width;
        this.length = length;
    }

    /**
     * getter cho centerPoint.
     */
    @Override
    public Point getCenterPoint() {
        return centerPoint;
    }

    /**
     * setter cho centerPoint.
     */
    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    /**
     * getter cho width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setter cho width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getter cho length.
     */
    public double getLength() {
        return length;
    }

    /**
     * setter cho length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * tính diện tích.
     */
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * tính chu vi.
     */
    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("HW_ON_TAP_GK.Rectangle[center=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.centerPoint.toString(),
                this.width,
                this.length,
                this.color != null && !this.color.isEmpty() ? this.color : "null",
                this.filled);
    }
}
