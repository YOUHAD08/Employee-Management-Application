public class project_UI {
    void welcome_page(){
        System.out.println("----Welcome to the Employee Management System----");
    }
    void header(){
        System.out.print("----- ----- -- EMS  -- ----- -----\n" );
    }
    void Home() {
        System.out.print(
                        """
                            1. Add an Employee\s
                            
                            2. Modify an Employee
                            
                            3. Delete an Employee
                            
                            4. Display the Employee List
                            
                            5. Search for an Employee
                            
                            6. Calculate the Total Salary
                            
                            7. Display the  Employees List sorted by Salary
                            
                            Choose an option:
                            """);
    }
    void footer(){
        System.out.print("H: Home ----- ----- ----- ----- ----- E: Exit\n" );
    }
    void Exit() {
        System.out.println("Exiting the Employee Management System");
    }
}