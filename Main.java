/**
 * This program tests the Triangle class.
 *
 * @author Emmanuel FN
 * @version 1.0
 * @since 2024-05-05
 */

public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("");

        // Test the first triangle (3 mm, 4 mm, 5 mm)
        TriangleTest testTriangle1 = new Triangle(3, 4, 5);
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle1.isValid());
        System.out.println(" → Semiperimeter: " + testTriangle1.semiPerimeter() + " mm");
        System.out.println(" → Area: " + testTriangle1.area() + " mm²");
        System.out.println(" → Type: " + testTriangle1.getType());
        System.out.println(" → Angle 1: " + testTriangle1.angle(1));
        System.out.println(" → Angle 2: " + testTriangle1.angle(2));
        System.out.println(" → Angle 3: " + testTriangle1.angle(3));
        System.out.println(" → Height 1: " + testTriangle1.height(1));
        System.out.println(" → Height 2: " + testTriangle1.height(2));
        System.out.println(" → Height 3: " + testTriangle1.height(3));
        System.out.println(" → Inner circle radius: " + testTriangle1.innerCircleRadius());
        System.out.println(" → Circumcircle radius: " + testTriangle1.circumsicleRadius());
        System.out.println("");

        // Test the second triangle (3 mm by 3 mm by 3 mm)
        TriangleTest testTriangle2 = new Triangle(3, 3, 3);
        System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle2.isValid());
        System.out.println(" → Semiperimeter: " + testTriangle2.semiPerimeter() + " mm");
        System.out.println(" → Area: " + testTriangle2.area() + " mm²");
        System.out.println(" → Type: " + testTriangle2.getType());
        System.out.println(" → Angle 1: " + testTriangle2.angle(1));
        System.out.println(" → Angle 2: " + testTriangle2.angle(2));
        System.out.println(" → Angle 3: " + testTriangle2.angle(3));
        System.out.println(" → Height 1: " + testTriangle2.height(1));
        System.out.println(" → Height 2: " + testTriangle2.height(2));
        System.out.println(" → Height 3: " + testTriangle2.height(3));
        System.out.println(" → Inner circle radius: " + testTriangle2.innerCircleRadius());
        System.out.println(" → Circumcircle radius: " + testTriangle2.circumsicleRadius());
        System.out.println("");

        // Test the third triangle (3 mm by 4 mm by 4 mm)
        TriangleTest testTriangle3 = new Triangle(3, 4, 4);
        System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle3.isValid());
        System.out.println(" → Semiperimeter: " + testTriangle3.semiPerimeter() + " mm");
        System.out.println(" → Area: " + testTriangle3.area() + " mm²");
        System.out.println(" → Type: " + testTriangle3.getType());
        System.out.println(" → Angle 1: " + testTriangle3.angle(1));
        System.out.println(" → Angle 2: " + testTriangle3.angle(2));
        System.out.println(" → Angle 3: " + testTriangle3.angle(3));
        System.out.println(" → Height 1: " + testTriangle3.height(1));
        System.out.println(" → Height 2: " + testTriangle3.height(2));
        System.out.println(" → Height 3: " + testTriangle3.height(3));
        System.out.println(" → Inner circle radius: " + testTriangle3.innerCircleRadius());
        System.out.println(" → Circumcircle radius: " + testTriangle3.circumsicleRadius());
        System.out.println("");

        // Test the fourth triangle (2 mm by 3 mm by 4 mm)
        TriangleTest testTriangle4 = new Triangle(2, 3, 4);
        System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle4.isValid());
        System.out.println(" → Semiperimeter: " + testTriangle4.semiPerimeter() + " mm");
        System.out.println(" → Area: " + testTriangle4.area() + " mm²");
        System.out.println(" → Type: " + testTriangle4.getType());
        System.out.println(" → Angle 1: " + testTriangle4.angle(1));
        System.out.println(" → Angle 2: " + testTriangle4.angle(2));
        System.out.println(" → Angle 3: " + testTriangle4.angle(3));
        System.out.println(" → Height 1: " + testTriangle4.height(1));
        System.out.println(" → Height 2: " + testTriangle4.height(2));
        System.out.println(" → Height 3: " + testTriangle4.height(3));
        System.out.println(" → Inner circle radius: " + testTriangle4.innerCircleRadius());
        System.out.println(" → Circumcircle radius: " + testTriangle4.circumsicleRadius());
        System.out.println("");

        // Test the fifth triangle (23 mm by 4 mm by 6 mm)
        TriangleTest testTriangle5 = new Triangle(23, 4, 6);
        System.out.println("Created a 23 mm by 4 mm by 6 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle5.isValid());
        System.out.println(" → Semiperimeter: " + testTriangle5.semiPerimeter() + " mm");
        System.out.println(" → Area: " + testTriangle5.area() + " mm²");
        System.out.println(" → Type: " + testTriangle5.getType());
        System.out.println(" → Angle 1: " + testTriangle5.angle(1));
        System.out.println(" → Angle 2: " + testTriangle5.angle(2));
        System.out.println(" → Angle 3: " + testTriangle5.angle(3));
        System.out.println(" → Height 1: " + testTriangle5.height(1));
        System.out.println(" → Height 2: " + testTriangle5.height(2));
        System.out.println(" → Height 3: " + testTriangle5.height(3));
        System.out.println(" → Inner circle radius: " + testTriangle5.innerCircleRadius());
        System.out.println(" → Circumcircle radius: " + testTriangle5.circumsicleRadius());
        System.out.println("");

        System.out.println("\nDone.");
    }
}
