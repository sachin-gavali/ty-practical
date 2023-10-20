// Step 1: Define the abstract class Staff
abstract class Staff {
    protected int id;
    protected String description;
    protected String name;

    public Staff(int id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    // Abstract method (to be implemented by subclasses)
    public abstract void displayDetails();
}

// Step 2: Create the subclass OfficeStaff
class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String description, String name, String department) {
        super(id, description, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        int n = 3; // Number of OfficeStaff objects to create

        // Create an array to hold the OfficeStaff objects
        OfficeStaff[] officeStaffArray = new OfficeStaff[n];

        // Create and populate OfficeStaff objects
        officeStaffArray[0] = new OfficeStaff(101, "Manager", "John Doe", "HR");
        officeStaffArray[1] = new OfficeStaff(102, "Assistant", "Jane Smith", "Finance");
        officeStaffArray[2] = new OfficeStaff(103, "Coordinator", "Alice Johnson", "Marketing");

        // Display details of all OfficeStaff objects
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Office Staff #" + (i + 1) + ":");
            officeStaffArray[i].displayDetails();
        }
    }
}
