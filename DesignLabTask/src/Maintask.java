public class Maintask {
    public static void main(String[] args) {
      Geometry square = ShapeFactory.getShape("square");
      Geometry circle = ShapeFactory.getShape("circle");
      Geometry triangle = ShapeFactory.getShape("triangle");
  
      System.out.println("Square area: " + square.area());
      System.out.println("Circle area: " + circle.area());
      System.out.println("Triangle area: " + triangle.area());
    }
  }