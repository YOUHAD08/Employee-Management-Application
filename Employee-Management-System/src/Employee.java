public class Employee {

    private int id;
    private String first_name;
    private String last_name;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String first_name, String last_name, String position, double salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
     public void compareBySalary(Employee employee1, Employee employee2) {
        if (employee1.getSalary() > employee2.getSalary()) {
            System.out.println(employee1);
        }
        else {System.out.println(employee2);}
     }

    @Override
    public String toString() {
        return String.format("%-20d|%-20s|%-20s|%-20s|%-20.2f %n", id, first_name, last_name, position, salary);
    }
}
