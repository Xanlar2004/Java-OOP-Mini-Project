class ShapeUtil {

    private static void swap(Shape shapes[], int i, int j) {
        Shape tmp;
        tmp = shapes[i];
        shapes[i] = shapes[j];
        shapes[j] = tmp;
    }

    public static void sort(Shape shapes[]) {
        for (int i = 0; i < shapes.length; i++) {
            for (int j = i + 1; j < shapes.length; j++) {
                if (shapes[i].getArea() > shapes[j].getArea()) {
                    swap(shapes, i, j);
                }
            }
        }
    }

    public static void printShapes(Shape shapes[]) {
        if(shapes.length > 0) {
            System.out.print("[");
            for (int i = 0; i < shapes.length - 1; i++) {
                System.out.printf("%s: %.3f, ", shapes[i].toString(), shapes[i].getArea());
            }
            System.out.printf("%s: %.3f]\n", shapes[shapes.length - 1].toString(), shapes[shapes.length - 1].getArea()); 
        } 
        else {
            System.out.println("[]");
        }
    }

    public static Shape findShapeByName(Shape shapes[], String name) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getName().equals(name)) {
                return shapes[i];
            }
        }
        return null;
    }

}