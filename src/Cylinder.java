// Define the Cylinder class
public class Cylinder {
    // Fields
    private double radius;
    private double height;

    // Default constructor
    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    // Parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the surface area of the cylinder
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Main method to test the Cylinder class
    public static void main(String[] args) {
        // Create an instance using the default constructor
        Cylinder defaultCylinder = new Cylinder();
        System.out.println("Default Cylinder:");
        System.out.println("Radius: " + defaultCylinder.getRadius());
        System.out.println("Height: " + defaultCylinder.getHeight());
        System.out.println("Volume: " + defaultCylinder.getVolume());
        System.out.println("Surface Area: " + defaultCylinder.getSurfaceArea());

        // Create an instance using the parameterized constructor
        Cylinder customCylinder = new Cylinder(3.0, 5.0);
        System.out.println("\nCustom Cylinder:");
        System.out.println("Radius: " + customCylinder.getRadius());
        System.out.println("Height: " + customCylinder.getHeight());
        System.out.println("Volume: " + customCylinder.getVolume());
        System.out.println("Surface Area: " + customCylinder.getSurfaceArea());

        // Modify the custom cylinder using setters
        customCylinder.setRadius(4.0);
        customCylinder.setHeight(6.0);
        System.out.println("\nModified Custom Cylinder:");
        System.out.println("Radius: " + customCylinder.getRadius());
        System.out.println("Height: " + customCylinder.getHeight());
        System.out.println("Volume: " + customCylinder.getVolume());
        System.out.println("Surface Area: " + customCylinder.getSurfaceArea());
    }
}

