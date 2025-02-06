
import java.util.Scanner;

public class EMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_Employees = 300;
        Employee_Management App_1 = new Employee_Management(new Employee[number_of_Employees]);
        project_UI App_1_UI = new project_UI();

        App_1_UI.welcome_page();
        App_1_UI.footer();

        while (App_1.is_running) {
            String choice = sc.next();
            App_1_UI.header();
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
                    App_1_UI.Exit();
                    App_1.is_running=false;
                    break;}
            if(App_1.is_running){App_1_UI.footer();}
        }
    }
}
