public class Employee {

    // Private attributes of the Employee class
    private int id;
    private String first_name;
    private String last_name;
    private String position;
    private double salary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor to initialize an Employee object
    public Employee(int id, String first_name, String last_name, String position, double salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.salary = salary;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for first_name
    public String getFirst_name() {
        return first_name;
    }

    // Setter method for first_name
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    // Getter method for last_name
    public String getLast_name() {
        return last_name;
    }

    // Setter method for last_name
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    // Getter method for position
    public String getPosition() {
        return position;
    }

    // Setter method for position
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Static method to compare employees based on their salary
    public static int compareBySalary(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }

    // Overriding toString() method to return a formatted string representation of an Employee object
    @Override
    public String toString() {
        return String.format("|%-20d|%-20s|%-20s|%-20s|%-20.2f| %n", id, first_name, last_name, position, salary);
    }
}
