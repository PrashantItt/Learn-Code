package Assignment6;

public class Main {
    public static void main(String[] args) {

        EmployeeRepository database = new Database();

        EmployeeService employeeService = new EmployeeService(database);

        Employee employee = new Employee("John Doe", "123 Main St");
        
        employeeService.saveEmployee(employee);
    }
}
