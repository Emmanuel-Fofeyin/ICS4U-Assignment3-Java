/**
 * This program runs with the Triangle class.
 *
 * @author Emmanuel FN
 * @version 1.0
 * @since 2024-05-05
 */

public class TriangleTest {
    // Instance variables for the sides of the triangle
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Constructor to initialize the sides of the triangle.
     *
     * @param side1 First side of the triangle
     * @param side2 Second side of the triangle
     * @param side3 Third side of the triangle
     */
    public Triangle(double side1, double side2, double side3) {
        this.sideA = side1;
        this.sideB = side2;
        this.sideC = side3;
    }

    /**
     * Getters for the sides of the triangle.
     */
    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    /**
     * Checks if the triangle has valid dimensions.
     *
     * @return true if valid, false otherwise
     */
    public boolean isValid() {
        return (this.sideA + this.sideB > this.sideC)
            && (this.sideB + this.sideC > this.sideA)
            && (this.sideC + this.sideA > this.sideB);
    }

    /**
     * Calculates the semi-perimeter of the triangle.
     *
     * @return the semi-perimeter
     */
    public double semiPerimeter() {
        if (!this.isValid()) {
            return -1;
        }
        return (this.sideA + this.sideB + this.sideC) / 2;
    }

    /**
     * Calculates the area of the triangle using Heron's formula.
     *
     * @return the area, or -1 if invalid
     */
    public double area() {
        if (!this.isValid()) {
            return -1;
        }
        double semiP = this.semiPerimeter();
        return Math.sqrt(
            semiP * (semiP - this.sideA) * (semiP - this.sideB) * (semiP - this.sideC)
        );
    }

    /**
     * Returns the type of triangle based on the side lengths and angles.
     *
     * @return the type of triangle
     */
    public String getType() {
        if (!this.isValid()) {
            return "Invalid";
        }
        if (this.sideA == this.sideB && this.sideB == this.sideC) {
            return "Equilateral triangle";
        } else if (
            this.angle(1) == Math.PI / 2
            || this.angle(2) == Math.PI / 2
            || this.angle(3) == Math.PI / 2
        ) {
            return "Right angle triangle";
        } else if (
            this.sideA == this.sideB
            || this.sideB == this.sideC
            || this.sideC == this.sideA
        ) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }

    /**
     * Calculates the angle of the triangle given the angle number (1, 2, 3).
     *
     * @param angleNumber the number representing the angle to calculate
     * @return the angle in radians
     */
    public double angle(int angleNumber) {
        if (!this.isValid()) {
            return -1;
        }
        double angle = -1;
        switch (angleNumber) {
            case 1:
                angle = Math.acos(
                    ((this.sideB * this.sideB) + (this.sideC * this.sideC) - (this.sideA * this.sideA))
                        / (2 * this.sideB * this.sideC)
                );
                break;
            case 2:
                angle = Math.acos(
                    ((this.sideC * this.sideC) + (this.sideA * this.sideA) - (this.sideB * this.sideB))
                        / (2 * this.sideC * this.sideA)
                );
                break;
            case 3:
                angle = Math.acos(
                    ((this.sideA * this.sideA) + (this.sideB * this.sideB) - (this.sideC * this.sideC))
                        / (2 * this.sideA * this.sideB)
                );
                break;
            default:
                angle = -1;
                break;
        }
        return angle;
    }

    /**
     * Calculates the height of the triangle relative to a given side.
     *
     * @param sideNumber the number representing the side (1, 2, 3)
     * @return the height
     */
    public double height(int sideNumber) {
        if (!this.isValid()) {
            return -1;
        }
        double height = -1;
        switch (sideNumber) {
            case 1:
                height = 2 * this.area() / this.sideA;
                break;
            case 2:
                height = 2 * this.area() / this.sideB;
                break;
            case 3:
                height = 2 * this.area() / this.sideC;
                break;
            default:
                height = -1;
                break;
        }
        return height;
    }

    /**
     * Calculates the radius of the inscribed circle.
     *
     * @return the radius, or -1 if invalid
     */
    public double innerCircleRadius() {
        if (!this.isValid()) {
            return -1;
        }
        return this.area() / this.semiPerimeter();
    }

    /**
     * Calculates the radius of the circumscribed circle.
     *
     * @return the radius, or -1 if invalid
     */
    public double circumsicleRadius() {
        if (!this.isValid()) {
            return -1;
        }
        return (this.sideA * this.sideB * this.sideC) / (4 * this.area());
    }
}
