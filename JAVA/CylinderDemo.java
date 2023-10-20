// Step 1: Define the Operation interface
interface Operation {
    double PI = 3.142; // Constant

    double volume(); // Abstract method
}

// Step 2: Create the Cylinder class implementing the Operation interface
class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}

public class CylinderDemo {
    public static void main(String[] args) {
        // Create an object of the Cylinder class
        Cylinder cylinder = new Cylinder(3.0, 5.0); // Example values for radius and height

        // Calculate and display the volume of the cylinder
        double cylinderVolume = cylinder.volume();
        System.out.println("Cylinder Volume: " + cylinderVolume);
    }
}
