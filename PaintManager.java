class PaintManager {

    public static Shape[] getPaintedShapes(Shape shapes[], int nbCans, double vol) {
        ShapeUtil.sort(shapes);
        double total = nbCans * vol;
        int paintedlength = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (total - shapes[i].getArea() >= 0) {
                paintedlength++;
                total = total - shapes[i].getArea();
            } 
            else
                break;
        }
        Shape PaintedShapes[] = new Shape[paintedlength];
        for (int i = 0; i < paintedlength; i++) {
            PaintedShapes[i] = shapes[i];
        }
        return PaintedShapes;
    }

}