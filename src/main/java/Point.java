package Week4.BT;

import java.util.Objects;

/**
 * Lớp Point mới.
 */
public class Point {
    /**
     * Khai báo thuộc tính.
     */
    private double pointX;
    private double pointY;

    /**
     * Hàm tạo default.
     */
    public Point() {
        pointX = 0.0;
        pointY = 0.0;
    }

    /**
     * Hàm tạo 2 tham số.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * getter cho pointX.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * setter cho pointX.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * getter cho pointY.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * setter cho pointY.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)",
                this.pointX,
                this.pointY);
    }
}
