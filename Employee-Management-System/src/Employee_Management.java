import java.util.Scanner;
import java.util.Arrays;

public class Employee_Management {
    // Flag to keep track of the program state
    boolean is_running = true;

    // Counter for the number of employees
    int increment_employee = 0;

    // Array to store Employee objects
    Employee[] Employee_list;

    // Scanner object for user input
    static Scanner clavier = new Scanner(System.in);

    // Constructor to initialize the employee list
    public Employee_Management(Employee[] Employee_list) {
        this.Employee_list = Employee_list;
    }

    // Method to add employees to the list
    void Add_Employees() {
        System.out.println("How Many Employees do you Want to Add ?");
        int number_of_Employees_to_add = clavier.nextInt();
        int i = 0;

        while (i < number_of_Employees_to_add) {
            System.out.printf("-----Employee %d----\n", (i + 1));

            System.out.println("Add Employee Id");
            int Id = clavier.nextInt();

            System.out.println("Add Employee First Name");
            String First_Name = clavier.next();

            System.out.println("Add Employee Last Name");
            String Last_Name = clavier.next();

            System.out.println("Add Employee Position");
            String Position = clavier.next();

            System.out.println("Add Employee Salary");
            double Salary = clavier.nextInt();

            // Creating and adding new Employee object
            Employee employee = new Employee(Id, First_Name, Last_Name, Position, Salary);
            Employee_list[increment_employee] = employee;

            i++;
            increment_employee++;
        }
        System.out.println("The Employees have been added \n");
    }

    // Method to modify employee details
    void Modify_employee() {
        boolean found = false;
        System.out.println("Please Provide The full Name of the employee to be modified ");
        System.out.println("First Name :");
        String FirstName = clavier.next();
        System.out.println("Last Name :");
        String LastName = clavier.next();

        for (int i = 0; i < increment_employee; i++) {
            if (Employee_list[i].getFirst_name().equals(FirstName) && Employee_list[i].getLast_name().equals(LastName)) {
                found = true;
                System.out.println("""
                        What should be Modified?
                        
                        1. Id
                        2. First Name
                        3. Last Name
                        4. Position
                        5. Salary
                        """);

                int choice = clavier.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the new ID");
                        Employee_list[i].setId(clavier.nextInt());
                        break;
                    case 2:
                        System.out.println("Enter the new Employee First Name");
                        Employee_list[i].setFirst_name(clavier.next());
                        break;
                    case 3:
                        System.out.println("Enter the new Employee Last Name:");
                        Employee_list[i].setLast_name(clavier.next());
                        break;
                    case 4:
                        System.out.println("Enter the new Employee Position:");
                        Employee_list[i].setPosition(clavier.next());
                        break;
                    case 5:
                        System.out.println("Enter the new Employee Salary:");
                        Employee_list[i].setSalary(clavier.nextDouble());
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
        if (!found) {
            System.out.println("The Employee you are asking for is not in the System\n");
        }
    }

    // Method to delete an employee by ID
    void Delete_Employee() {
        boolean found = false;
        System.out.println("Please Provide The Id of the Employee to be deleted ");
        int Id = clavier.nextInt();

        for (int i = 0; i < Employee_list.length; i++) {
            if (Employee_list[i] != null && Employee_list[i].getId() == Id) {
                found = true;
                System.arraycopy(Employee_list, i + 1, Employee_list, i, Employee_list.length - i - 1);
                System.out.println("The Employee has been deleted \n");
            }
        }
        if (!found) {
            System.out.println("The Employee you are asking for is not in the stock\n");
        }
    }

    // Method to search for an employee by full name
    void Search_Employee() {
        System.out.println("Please Provide The full Name of the employee  ");
        System.out.println("First Name :");
        String FirstName = clavier.next();
        System.out.println("Last Name :");
        String LastName = clavier.next();
        boolean found = false;

        for (int i = 0; i < increment_employee; i++) {
            if (Employee_list[i].getFirst_name().equals(FirstName) && Employee_list[i].getLast_name().equals(LastName)) {
                found = true;
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%n","Id","First Name","Last Name","Position","Salary");
                System.out.print(Employee_list[i]);
            }
        }
        if (!found) {
            System.out.println("The Employee you are asking for is not in the system\n");
        }
    }

    // Method to display the list of employees
    void Display_Employees_list() {
        System.out.println("Employee List");
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%n","Id","First Name","Last Name","Position","Salary");
        for (int i = 0; i < increment_employee; i++) {
            System.out.print(Employee_list[i]);
        }
    }

    // Method to calculate the total payroll
    void calculatePayroll() {
        double Payroll = 0;
        for (int i = 0; i < increment_employee; i++) {
            Payroll += Employee_list[i].getSalary();
        }
        System.out.printf("The total salary paid to employees is : %.2f %n" , Payroll);
    }

    // Method to sort employees by salary
    void sortEmployeesBySalary() {
        System.out.println("""
                    How would you like to sort the employees?
                    1. ASCENDING  (Lowest to Highest)
                    2. DESCENDING (Highest to Lowest)
                    Please enter your choice:
                    """);
        int choice = clavier.nextInt();
        switch (choice) {
            case 1:
                Arrays.sort(Employee_list, 0, increment_employee, Employee::compareBySalary);
                System.out.println("Employees have been sorted in ASCENDING order by salary.");
                break;
            case 2:
                Arrays.sort(Employee_list, 0, increment_employee, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
                System.out.println("Employees have been sorted in DESCENDING order by salary.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }

    }
}
