package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;


    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNiNumber() {
        return this.niNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raise) {
        this.salary += raise;
    }

    public double payBonus() {
        return this.salary * 1 / 100;
    }

}
