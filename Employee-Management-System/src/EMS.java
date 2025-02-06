import java.util.Scanner;

public class EMS {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Define the maximum number of employees
        int number_of_Employees = 300;

        // Create an instance of Employee_Management with a predefined employee array
        Employee_Management App_1 = new Employee_Management(new Employee[number_of_Employees]);

        // Create an instance of project_UI for UI interactions
        project_UI App_1_UI = new project_UI();

        // Display welcome message and footer
        App_1_UI.welcome_page();
        App_1_UI.footer();

        // Main application loop
        while (App_1.is_running) {
            // Read user input
            String choice = sc.next();

            // Display header
            App_1_UI.header();

            // Handle user input
            switch (choice) {
                case "1":
                    App_1.Add_Employees();
                    break;
                case "2":
                    App_1.Modify_employee();
                    break;
                case "3":
                    App_1.Delete_Employee();
                    break;
                case "4":
                    App_1.Display_Employees_list();
                    break;
                case "5":
                    App_1.Search_Employee();
                    break;
                case "6":
                    App_1.calculatePayroll();
                    break;
                case "7":
                    App_1.sortEmployeesBySalary();
                    break;
                case "H" :
                    App_1_UI.Home();
                    break;
                case "E":
                    // Exit the application
                    App_1_UI.Exit();
                    App_1.is_running = false;
                    break;
            }

            // Display footer if the application is still running
            if (App_1.is_running) {
                App_1_UI.footer();
            }
        }
    }
}
