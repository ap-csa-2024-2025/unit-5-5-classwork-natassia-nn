import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // I want to be able to change my object, BUT I cannot because everything is private
    p1.setX(5);
    p2.setY(10);
    System.out.println(p1.x + " " + p1.y);
    p2.x = p1.y;

    Scanner sc = new Scanner(System.in);
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

    System.out.println("Give me two numbers");
    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

      p1.setX(in_x);
      p1.setY(in_y);

    System.out.println("You made a point at (" + p1.getX() + ", " + p1.getY() + ")");

    Dog myDog = new Dog();
    myDog.setBreed("yorkie");
    myDog.setSize(15.0);
    myDog.setColor("brown");

    System.out.println("Your dog is a " + myDog.getColor() ", " + myDog.getSize() + " lbs " + )

  }
}
