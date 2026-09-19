
public class Employee {

    private String firstname;
    private String lastname;
    private double monthlysalary;

    public Employee(String firstname, String lastname, double monthlysalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlysalary = monthlysalary;
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlysalary = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getMonthlysalary() {
        return monthlysalary;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMonthlysalary(double monthlysalary) {
        if (monthlysalary > 0) {
            this.monthlysalary = monthlysalary;
        }
    }
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Smith", 3000);
        Employee employee2 = new Employee("Alice", "Brown");

        System.out.println(employee1.getFirstname());
        System.out.println(employee1.getLastname());
        System.out.println(employee1.getMonthlysalary());

        System.out.println(employee2.getFirstname());
        System.out.println(employee2.getLastname());
        System.out.println(employee2.getMonthlysalary());

        System.out.println("Yearly salary: " + employee1.getMonthlysalary() * 12);

        employee1.setMonthlysalary(employee1.getMonthlysalary() * 1.10);

        System.out.println("After 10% raise: " + employee1.getMonthlysalary());
    }
}
