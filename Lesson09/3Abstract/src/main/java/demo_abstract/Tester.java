package demo_abstract;

public class Tester extends Employee {
    private int errors;

    public Tester() {
    }

    public Tester(int id, String name, String email, int basicSalary, int errors) {
        super(id, name, email, basicSalary);
        this.errors = errors;
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + errors * 50_000;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }
}
