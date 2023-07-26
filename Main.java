import java.util.*;

public class Main {

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle("r1", 3, 5);
        Rectangle r2 = new Rectangle("r2", 2, 7);
        Rectangle r3 = new Rectangle("my_rect", 5, 5);

        Sphere s1 = new Sphere("s1", 3);
        Sphere s2 = new Sphere("s2", 6);
        Sphere s3 = new Sphere("ball", 5);

        Shape[] shapes = new Shape[] { s2, r1, s1, r2, s3, r3 };

        //System.out.println("**Printing all the shapes**");
        //ShapeUtil.printShapes(shapes);

        //ShapeUtil.sort(shapes);
        //ShapeUtil.printShapes(shapes);

        //System.out.println("**Printing the shapes that could be painted\n\tgiven the #cans and value of each can**");
        
        System.out.println("Please enter the number of cans and volume of a single can to find the printed shapes:"); 
        Scanner sc = new Scanner(System.in);
        try {
            int nbCans = sc.nextInt();
            double vol = sc.nextDouble();
            if (nbCans < 0 || vol < 0) {
                System.out.println("Please enter non-negative numbers for the number of cans and the volume of each can!");
            }
            else {
                ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes, nbCans, vol));
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Please enter an integer number for the number of cans and integer or floating point number for the volume of each can!");
        }
        finally {
            sc.nextLine();
        }
        //ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes, 3, 100));

        //System.out.println("**Finding and printing the shapes based on the given name**");
        // TODO: Ask from user the name to search for
        System.out.println("Please enter the name to search for:"); 
        String name = sc.next();
        System.out.println(name + ": " + ShapeUtil.findShapeByName(shapes, name));
        sc.close();
        //System.out.println("ball: " + ShapeUtil.findShapeByName(shapes, "ball"));
        
        //System.out.println("rect: " + ShapeUtil.findShapeByName(shapes, "rect"));
    }
}
