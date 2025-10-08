package Week4.BT;


/**
 * Lớp trừu tượng.
 */
public abstract class Shape {
    /**
     * Khai báo thuộc tính.
     */
    protected String color;
    protected boolean filled;

    /**
     * Hàm tạo ko tham số.
     */
    public Shape() {
        this.color = "";
        this.filled = false;
    }

    /**
     * Hàm tạo có 2 tham số.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter cho color.
     */
    public String getColor() {
        return color;
    }

    /**
     * setter cho color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getter cho filled isFilled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * setter cho filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Tính diện tích (abstract để triển khai ở subclass).
     */
    public abstract double getArea();

    /**
     * getter cho centerPoint.
     */
    public abstract Point getCenterPoint();

    /**
     * Tính chu vi.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("Shape[color=%s,filled=%s]",
                this.color != null && !this.color.isEmpty() ? this.color : "null",
                this.filled);
    }
}

