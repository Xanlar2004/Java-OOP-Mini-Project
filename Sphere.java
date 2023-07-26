class Sphere extends Shape {

    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        super.setType("sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 4 * Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return super.toString() + "[" + this.radius + "]";
    }

}