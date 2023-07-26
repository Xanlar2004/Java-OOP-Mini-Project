class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        super.setType("rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public String toString() {
        return super.toString() + "[" + this.width + ", " + this.height + "]";
    }

}