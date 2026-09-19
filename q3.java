public class q3 {

    private Employee boss;
    private Employee employee;

    public q3(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployee() {
        System.out.println(employee.getFirstname());
        System.out.println(employee.getLastname());
        System.out.println(employee.getMonthlysalary());
    }

    public void printAll() {
        System.out.println("Boss:");
        System.out.println(boss.getFirstname());
        System.out.println(boss.getLastname());
        System.out.println(boss.getMonthlysalary());

        System.out.println("Employee:");
        System.out.println(employee.getFirstname());
        System.out.println(employee.getLastname());
        System.out.println(employee.getMonthlysalary());
    }

    public void updateSalary(String firstname, double salary) {
        if (employee.getFirstname().equals(firstname) && salary > 0) {
            employee.setMonthlysalary(salary);
        }
    }

    public void raiseAll() {
        boss.setMonthlysalary(boss.getMonthlysalary() * 1.10);
        employee.setMonthlysalary(employee.getMonthlysalary() * 1.10);
    }

    public static void main(String[] args) {

        Employee boss = new Employee("John", "Smith", 5000);
        Employee employee = new Employee("Alice", "Brown", 3000);

        q3 team = new q3(boss, employee);

        team.printAll();

        team.updateSalary("Alice", 3500);

        team.raiseAll();

        team.printAll();
    }
}