/*
* This program runs with the Triangle class.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-05-05
*/

public class Triangle {
    // variables
    private double sideA;
    private double sideB;
    private double sideC;
  
    /*
    * Constructor.
    */
    public Triangle(double side1, double side2, double side3) {
      this.sideA = side1;
      this.sideB = side2;
      this.sideC = side3;
    }
  
    /*
    * Getter for sideA
    */
    public double getSideA() {
      return this.sideA;
    }
  
    /*
    * Getter for sideB
    */
    public double getSideB() {
      return this.sideB;
    }
  
    /*
    * Getter for sideC
    */
    public double getSideC() {
      return this.sideC;
    }
  
    /*
    * Checks if the triangle has valid dimensions
    */
    public boolean isValid() {
    boolean isValid = true;
      if ((this.sideA + this.sideB) < this.sideC) {
        isValid = false;
      } else if ((this.sideB + this.sideC) < this.sideA) {
        isValid = false;
      } else if ((this.sideC + this.sideA) < this.sideB) {
        isValid = false;
      }
      return isValid;
    }
  
    /*
    * Calculates the area
    */
    public double area() {
      if (this.isValid() == false) {
        return -1;
      } else {
        return Math.sqrt(this.semiPerimeter()
          * (this.semiPerimeter() - this.sideA)
          * (this.semiPerimeter() - this.sideB)
          * (this.semiPerimeter() - this.sideC)
        );
      }
    }
  
    /*
    * Finds the type of triangle
    */
    public String getType() {
      if (this.isValid() == false) {
        return "-1";
      } else {
        String triangleType;
        if (
          this.sideA == this.sideB &&
          this.sideB == this.sideC &&
          this.sideC == this.sideA
        ) {
          triangleType = "Equilateral triangle";
        } else if (
          this.angle(1) == (Math.PI / 2) ||
          this.angle(2) == (Math.PI / 2) ||
          this.angle(3) == (Math.PI / 2)
        ) {
          triangleType = "Right angle triangle";
        } else if (
          this.sideA == this.sideB ||
          this.sideB == this.sideC ||
          this.sideC == this.sideA
        ) {
          triangleType = "Isosceles triangle";
        } else if (this.sideA != this.sideB != this.sideC) {
          triangleType = "Scalene triangle";
        }
        return triangleType;
      }
    }
  
    /*
    * Calculates the semi-perimeter
    */
    public double semiPerimeter() {
      if (this.isValid() == false) {
        return -1;
      } else {
        return (this.sideA + this.sideB + this.sideC) / 2;
      }
    }
  
    /*
    * Calculates each angle of the triangle
    */
    public double angle(int angleNumber) {
      if (this.isValid() == false) {
        return -1;
      } else {
        double angle;
        if (angleNumber == 1) {
          angle = Math.acos(
            ((this.sideB * this.sideB) + (this.sideC * this.sideC) - (this.sideA * this.sideA))
            / (2 * this.sideB * this.sideC)
          );
        } else if (angleNumber == 2) {
          angle = Math.acos(
            ((this.sideC * this.sideC) + (this.sideA * this.sideA) - (this.sideB * this.sideB))
            / (2 * this.sideC * this.sideA)
          );
        } else if (angleNumber == 3) {
          angle = Math.acos(
            ((this.sideA * this.sideA) + (this.sideB * this.sideB) - (this.sideC * this.sideC))
            / (2 * this.sideA * this.sideB)
          );
        }
        return angle;
      }
    }
  
    /*
    * Calculates each height of the triangle
    */
    public double height(int sideNumber) {
      if (this.isValid() == false) {
        return -1;
      } else {
        double height;
        if (sideNumber == 1) {
          height = 2 * this.area() / this.sideA;
        } else if (sideNumber == 2) {
          height = 2 * this.area() / this.sideB;
        } else if (sideNumber == 3) {
          height = 2 * this.area() / this.sideC;
        }
        return height;
      }
    }
  
    /*
    * Calculates the inner circle radius
    */
    public double innerCircleRadius() {
      if (this.isValid() == false) {
        return -1;
      } else {
        return this.area() / this.semiPerimeter();
      }
    }
  
    /*
    * Calculates the circumsicle radius
    */
    public double circumsicleRadius() {
      if (this.isValid() == false) {
        return -1;
      } else {
        return (this.sideA * this.sideB * this.sideC) / (4 * this.area());
      }
    }
}
