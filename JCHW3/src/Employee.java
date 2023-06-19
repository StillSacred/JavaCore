public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String position;
    private int salary;

    public Employee(String firstName, String lastName, int age, String phoneNumber, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String employeeInfo() {
        return String.format("Name: %s %s; Age: %d; Position: %s; Salary: %d; Phone number: %s",
                this.getFirstName(), this.getLastName(), this.getAge(), this.getPosition(),
                this.getSalary(), this.getPhoneNumber());
    }

    @Override
    public String toString() {
        return this.employeeInfo();
    }
}