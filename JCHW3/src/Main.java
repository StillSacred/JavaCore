import java.util.Comparator;

public class Main {
    public static void printWorkers(WorkersList workers) {
        for (Employee employee : workers) {
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {
        Comparator<Employee> eComp = new EmployeeAgeComparator().thenComparing(new EmployeeSalaryComparator());
        WorkersList workers = new WorkersList();
        workers.addWorker(new Employee("Ivan", "Ivanov", 29, "1234567890",
                "engineer", 50000));
        workers.addWorker(new Employee("Petr", "Petrov", 20, "1234567890",
                "trainee", 20000));
        workers.addWorker(new Manager("Boris", "Borisov", 45, "1234567890",
                "chief engineer", 80000));
        workers.addWorker(new Employee("Irina", "Ivanova", 37, "1234567890",
                "accountant", 60000));
        workers.addWorker(new Employee("Mihail", "Mihailov", 20, "1234567890",
                "trainee", 16000));

        printWorkers(workers);
        System.out.println("\n Time for sorting!\n");
        workers.sort(eComp);
        printWorkers(workers);

        System.out.println("\nTime for promotion!\n");
        Manager.salaryUp(workers, 5000);
        printWorkers(workers);
    }
}