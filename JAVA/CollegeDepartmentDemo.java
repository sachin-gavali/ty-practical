// Parent class College
class College {
    protected int cno;
    protected String cname;
    protected String caddr;

    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    public void displayCollegeDetails() {
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}

// Derived class Department
class Department extends College {
    private int dno;
    private String dname;

    public Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    public void displayDepartmentDetails() {
        displayCollegeDetails(); // Inherited method to display College details
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class CollegeDepartmentDemo {
    public static void main(String[] args) {
        // Create an object of the Department class
        Department department = new Department(1, "Sample College", "123 College St", 101, "Computer Science");

        // Display College and Department details
        System.out.println("College and Department Details:");
        department.displayDepartmentDetails();
    }
}
