public class Manager extends Employee {
    public static void salaryUp(WorkersList workers, int raise) {
        for (Employee employee : workers) {
            if (!employee.getClass().getSimpleName().equalsIgnoreCase("manager")) {
                employee.setSalary(employee.getSalary() + raise);
            }
        }
    }

    public Manager(String firstName, String lastName, int age, String phoneNumber, String position, int salary) {
        super(firstName, lastName, age, phoneNumber, position, salary);
    }
}