package Question_11;

public class shape_main {
    public static void main(String[] args) {
      
        circle circle = new circle(5);
        triangle triangle = new triangle(3, 4, 5);

   
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}