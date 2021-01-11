package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;


    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raise) {
        if (raise >= 0.00) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary * 1 / 100;
    }

}
