public class project_UI {
    // Method to display the welcome message
    void welcome_page(){
        System.out.println("----Welcome to the Employee Management System----");
    }

    // Method to display the header
    void header(){
        System.out.print("----- ----- -- EMS  -- ----- -----\n" );
    }

    // Method to display the home menu with options
    void Home() {
        System.out.print(
                """
                    1. Add an Employee\s
                    
                    2. Modify an Employee
                    
                    3. Delete an Employee
                    
                    4. Display the Employees List
                    
                    5. Search for an Employee
                    
                    6. Calculate the Total Salary
                    
                    7. Display the  Employees List sorted by Salary
                    
                    Choose an option:
                    """);
    }

    // Method to display the footer
    void footer(){
        System.out.print("H: Home ----- ----- ----- ----- ----- E: Exit\n" );
    }

    // Method to display the exit message
    void Exit() {
        System.out.println("Exiting the Employee Management System");
    }
}
