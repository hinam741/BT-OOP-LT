import java.util.Objects;

/**
 * Lớp con square hình vuông kế thừa rectangle.
 */
public class Square extends Rectangle {
    /**
     * Hàm tạo 5 tham số.
     */
    public Square(Point centerPoint, double side, String color, boolean filled) {
        super(centerPoint, side, side, color, filled);
    }

    /**
     * getter cho side.
     */
    public double getSide() {
        return this.width;
    }

    /**
     * setter cho side.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * setter cho width với tham số side.
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * setter cho length với tham số side.
     */
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("Square[center=%s,side=%.1f,color=%s,filled=%s]",
                this.getCenterPoint().toString(),
                this.width,
                this.color != null && !this.color.isEmpty() ? this.color : "null",
                this.filled);
    }
}
